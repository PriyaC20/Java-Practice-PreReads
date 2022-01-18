import Form from "./Form";
import { fireEvent, render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';

describe("Basic rendering of Form", () => {
    it("Should contain input label", () => {
        const form = render(<Form/>);
        const label = screen.getByText("What needs to be done?");
        expect(label).toBeInTheDocument();
    });
    it("Should have an input text box empty", () => {
        const form = render(<Form />);
        expect(form.getByTestId("new-todo-input")).toHaveTextContent('');
    });
    it("Should have an Add Button", () => {
        const {getByTestId} = render(<Form/>);
        expect(getByTestId("add-button")).toHaveTextContent("Add");
    });
});

describe("Testing add task", () => {

    it("Should call addTask() with the newly added task", () => {
        const addTask = jest.fn().mockName("addTask")
        const {getByTestId} = render(<Form addTask={addTask}/>);
        userEvent.type(getByTestId("new-todo-input"), "Study");
        userEvent.click(getByTestId("add-button"));
        expect(addTask).toHaveBeenCalledWith("Study");
    });
});