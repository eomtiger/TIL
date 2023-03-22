import logo from "./logo.svg";
import "./App.css";
import { useState, useEffect } from "react";
import Test from "./Test";

function App() {
  const [a, setA] = useState(0);
  const aHandler = (e) => {
    setA(e);
  };

  return (
    <>
      <Test aHandler={aHandler} />
      {a}
    </>
  );
}

export default App;
