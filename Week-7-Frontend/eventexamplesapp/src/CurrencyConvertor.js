import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const convert = () => {
    const result = (parseFloat(rupees) / 90).toFixed(2);
    setEuro(result);
  };

  return (
    <div>
      <h2>Currency Convertor</h2>

      <input
        type="number"
        placeholder="Enter INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />

      <button onClick={convert}>
        Convert
      </button>

      {euro && <h3>Euro: €{euro}</h3>}
    </div>
  );
}

export default CurrencyConvertor;