import { useState } from "react"


function Form(props) {
    const [name, setName] = useState('');
    
    function handleSubmit(e) {
        e.preventDefault();
        props.addTask(name);
        setName("");
    }
    function handleChange(e) {
        setName(e.target.value);
    }

    return (
        <form onSubmit={handleSubmit}>
            <h2 className="label-wrapper">
                <label htmlFor="new-todo-input" className="label__lg">What needs to be done?</label>
            </h2>
            <input type="text" id="new-todo-input" data-testid="new-todo-input" name="text" className="input input__lg" value={name} autoComplete="off" onChange={handleChange}/>
            <button type="submit" data-testid="add-button" className="btn btn__primary btn__lg">Add</button>
        </form>
    )
}

export default Form;