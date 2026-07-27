import React from "react";

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest</h2>

      <h3>Available Flights</h3>

      <ul style={{ listStyle: "none" }}>
        <li>Delhi → Mumbai</li>
        <li>Chennai → Bangalore</li>
        <li>Kolkata → Hyderabad</li>
      </ul>

      <p>Please login to book your ticket.</p>
    </div>
  );
}

export default GuestPage;