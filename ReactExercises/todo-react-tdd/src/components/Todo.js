import { useState } from "react";

function Todo(props) {

    const [isEditing, setEditing] = useState(false);
    const [newName, setNewName] = useState('');

    function handleChange(e) {
        setNewName(e.target.value);
    }
    
    function handleSubmit(e) {
        e.preventDefault();
        props.editTask(props.id, newName);
        setNewName("");
        setEditing(false);
    }

    const editTemplate = (
        <form className="stack-small" onSubmit={handleSubmit}>
            <div className="form-group">
                <label className="todo-label" htmlFor={props.id}>New name for {props.name} </label>
                <input data-testid="updatedName" id={props.id}  type="text" className="todo-text" onChange={handleChange} value={newName}/>
            </div>
            <div className="btn-group">
                <button type="submit" data-testid="edit-save-button" className="btn btn__primary todo-edit">Save</button>
                <button type="button" className="btn todo-cancel" onClick={()=>setEditing(false)}>Cancel</button>
            </div>
        </form>
    )
    const viewTemplate = (
        <div className="stack-small">
          <div className="c-cb">
            <input type="checkbox" id={props.id} data-testid="toggle-task" defaultChecked={props.completed} onChange={()=>props.toggleTaskCompleted(props.id)}/>
            <label data-testid='task-label' className="todo-label" htmlFor={props.id}>{props.name}</label>
          </div>
          <div className="btn-group">
            <button type="button" data-testid="edit-button" className="btn" onClick={() => setEditing(true)}>Edit</button>
            <button type="button" data-testid="delete-button" className="btn btn__danger" onClick={()=>props.deleteTask(props.id)}>Delete</button>
          </div>
        </div>
    );
    return <li className="todo">{isEditing ? editTemplate : viewTemplate}</li>;
}

export default Todo;