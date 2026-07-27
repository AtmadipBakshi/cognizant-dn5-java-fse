import React from "react";
import office from "./office.jpg";

function App() {
  const officeList = [
    {
      name: "Tech Park",
      rent: 55000,
      address: "Bangalore"
    },
    {
      name: "Cyber Hub",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      name: "Business Center",
      rent: 62000,
      address: "Chennai"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src={office}
        alt="Office"
        width="400"
      />

      <hr />

      {officeList.map((item, index) => (
        <div key={index}>
          <h2>{item.name}</h2>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            Rent: {item.rent}
          </p>

          <p>Address: {item.address}</p>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;