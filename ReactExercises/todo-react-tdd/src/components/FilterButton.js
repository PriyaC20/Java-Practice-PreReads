function FilterButton(props) {
    return (
        <button type="button" data-testid="filter-button" className="btn toggle-btn" aria-pressed={props.isPressed} onClick={()=>props.setFilter(props.name)}>{props.name}</button>
    );
}

export default FilterButton;