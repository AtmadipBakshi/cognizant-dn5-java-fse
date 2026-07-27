import React from "react";

function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>

      <table border="1" align="center" cellPadding="10">
        <thead>
          <tr>
            <th>Course</th>
            <th>Duration</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>ReactJS</td>
            <td>6 Weeks</td>
          </tr>

          <tr>
            <td>Spring Boot</td>
            <td>8 Weeks</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default CourseDetails;