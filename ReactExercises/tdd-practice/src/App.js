import NewMessageForm from './NewMessageForm.js';
import { useState } from 'react';
import MessageList from './MessageList.js';

const App = () => {
  const [messages, setMessages] = useState([]);
  const handleSend = newMessage => {
    setMessages([newMessage, ...messages]);
  };
  return (
    <div>
      <NewMessageForm onSend={handleSend}/>
      <MessageList data={messages}/>
    </div>
  );
};

export default App;
