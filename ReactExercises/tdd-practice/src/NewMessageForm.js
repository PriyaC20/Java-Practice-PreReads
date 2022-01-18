import { useState } from "react";

const NewMessageForm = (props) => {
    const [inputText, setInputTest] = useState('');

    const handleTextChange = event => {
        setInputTest(event.target.value);
    }

    const handleSend = () => {
        props.onSend(inputText);
        setInputTest('');
    }
    return (
      <div>
          <input type="text" data-testid="messageText" value={inputText} onChange={handleTextChange}/>
          <button data-testid="sendButton" onClick={handleSend}>Send</button>
         
      </div>
    );
  };
  
export default NewMessageForm;