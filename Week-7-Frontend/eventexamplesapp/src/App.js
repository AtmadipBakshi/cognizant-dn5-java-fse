import React, { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const sayHello = () => {
    console.log("Hello! Member1");
  };

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert("I was clicked");
    console.log(e);
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>React Event Examples</h1>

      <h2>Counter: {count}</h2>

      <button onClick={increment}>
        Increment
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>
        Click Me
      </button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;