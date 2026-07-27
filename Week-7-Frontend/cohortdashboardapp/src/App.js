import React from "react";
import "./App.css";
import CohortDetails from "./CohortDetails";

function App() {
  const cohorts = [
    {
      name: "React Fundamentals",
      startDate: "10-Feb-2025",
      status: "Ongoing",
      coach: "John",
      trainer: "David"
    },
    {
      name: "Java FSE",
      startDate: "15-Jan-2025",
      status: "Completed",
      coach: "Smith",
      trainer: "Joseph"
    },
    {
      name: "Microservices",
      startDate: "20-Mar-2025",
      status: "Ongoing",
      coach: "Rahul",
      trainer: "Kiran"
    },
    {
      name: "Spring Boot",
      startDate: "01-Dec-2024",
      status: "Completed",
      coach: "Anita",
      trainer: "Ravi"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h1>Cognizant Academy Dashboard</h1>

      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          name={cohort.name}
          startDate={cohort.startDate}
          status={cohort.status}
          coach={cohort.coach}
          trainer={cohort.trainer}
        />
      ))}
    </div>
  );
}

export default App;