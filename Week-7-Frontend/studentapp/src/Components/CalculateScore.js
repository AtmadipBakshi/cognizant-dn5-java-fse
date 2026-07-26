import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore() {
  const student = {
    Name: "Atmadip Bakshi",
    School: "VIT-AP University",
    Total: 500,
    Goal: 450
  };

  const average = student.Goal / 5;

  return (
    <div className="container">
      <h2>Student Score Calculator</h2>

      <p><strong>Name:</strong> {student.Name}</p>
      <p><strong>School:</strong> {student.School}</p>
      <p><strong>Total Marks:</strong> {student.Total}</p>
      <p><strong>Goal:</strong> {student.Goal}</p>
      <p><strong>Average Score:</strong> {average}</p>
    </div>
  );
}

export default CalculateScore;