import { getByTestId } from "@testing-library/react";
import { shallow } from "enzyme";
import { render} from '@testing-library/react';
import Todo from './Todo';
import userEvent from '@testing-library/user-event';
import TestRenderer from 'react-test-renderer';

describe("Basic rendering of tasks", () => {
    it("Should render tasks", () => {
        const taskName='Eat';
        const { getByTestId } = render(<Todo name={taskName}/>);
        expect(getByTestId("task-label")).toHaveTextContent(taskName);
    });

    it("Should have edit and delete botton", () => {
        const {getByTestId} = render(<Todo/>);
        expect(getByTestId("edit-button")).toHaveTextContent("Edit");
        expect(getByTestId("delete-button")).toHaveTextContent("Delete");
    });

    it("Should be able to toggle tasks", () => {
        const {getByTestId} = render(<Todo/>);
        expect(getByTestId("toggle-task")).not.toHaveAttribute("Disabled");
    });
});

describe("Editing, Deleting, Toggling tasks", () => {

    it("Should call deleteTask() when delete button is clicked", () => {
        const id="todo-0";
        const deleteTask = jest.fn().mockName("deleteTask")
        const {getByTestId} = render(<Todo deleteTask={deleteTask} id={id}/>);
        userEvent.click(getByTestId("delete-button"));
        expect(deleteTask).toHaveBeenCalledWith(id);
    });

    it("Should call toggleTaskCompleted() when the checkbox is toggled", () => {
        const id="todo-1";
        const toggleTaskCompleted = jest.fn().mockName("toggleTaskCompleted")
        const {getByTestId} = render(<Todo toggleTaskCompleted={toggleTaskCompleted} id={id}/>);
        userEvent.click(getByTestId("toggle-task"));
        expect(toggleTaskCompleted).toHaveBeenCalledWith(id);
    });

    // it("Should call editTask() when save button is pressed", () => {
    //     const id="todo-1";
    //     const newName='Study';
    //     const editTask = jest.fn().mockName("editTask")
    //     const {getByTestId} = render(<Todo editTask={editTask} id={id} name='Eat'/>);
    //     userEvent.type(getByTestId("updatedName"), "Study");
    //     userEvent.click(getByTestId("edit-save-button"));
    //     expect(editTask).toHaveBeenCalledWith(id, newName);
    // })

});