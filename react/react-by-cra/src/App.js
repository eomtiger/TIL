// import Button from "./Button";
// import styles from "./App.module.css";
import { useState, useEffect } from "react";

function App() {
  const [counter, setValue] = useState(0);
  const [keyword, setKeyword] = useState("");
  const onClick = () => setValue((prev) => prev + 1);
  const onChange = (event) => setKeyword(event.target.value);

  console.log('run all the time');  

  useEffect(() =>{
    console.log('call the api')
  }, []);

  useEffect(() => {
    if (keyword !=="" && keyword.length > 5){
      console.log("search for", keyword);
    }
  }, [keyword]);

  return (
    <div>    
      <input value={keyword} onChange={onChange} type='text' placeholder="search here"/>  
      <h1>{counter}</h1>
      <button onClick={onClick}>click me</button>
    </div>
  );
}

function Hello(){
  function destroyedFn() {
    console.log('bye')
  };
  function effectFn() {
    console.log('created')
    return destroyedFn;
  }
  useEffect((effectFn), [])
  return <h1>hello</h1>
}

function App1() {
  const [showing, setShowing] = useState(false);
  const onClick = () => setShowing(prev => !prev)
  return <div>
    {showing ? <Hello/> : null}
    <button onClick={onClick}>{showing ? 'Hide' : 'Show'}</button>
  </div>;
}

export default App1;
