import React from "react";

function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>

      <table border="1" align="center" cellPadding="10">
        <thead>
          <tr>
            <th>Book</th>
            <th>Author</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Clean Code</td>
            <td>Robert C. Martin</td>
          </tr>

          <tr>
            <td>Effective Java</td>
            <td>Joshua Bloch</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default BookDetails;