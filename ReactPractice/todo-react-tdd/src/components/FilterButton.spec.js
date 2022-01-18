import FilterButton from './FilterButton';
import { shallow } from 'enzyme';
import { render} from '@testing-library/react';
import userEvent from '@testing-library/user-event';

describe("Basic rendering of filter buttons", () => {

    it("Should have filter buttons", () => {
        const filter_button = 'All';
        const {getByTestId} = render(<FilterButton name={filter_button}/>);
        expect(getByTestId("filter-button")).toHaveTextContent(filter_button);
    });

});

describe("Testing filter list", () => {
    it("Should call setFilter() with the button name when it is clicked", () => {
        const setFilter = jest.fn().mockName("setFilter");
        const filterName = "Active";
        const {getByTestId} = render(<FilterButton setFilter={setFilter} name={filterName}/>);
        userEvent.click(getByTestId("filter-button"));
        expect(setFilter).toHaveBeenCalledWith(filterName);
    });
});