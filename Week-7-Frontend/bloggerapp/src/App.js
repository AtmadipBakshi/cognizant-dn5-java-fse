import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("");

  return (
    <div style={{ textAlign: "center", marginTop: "20px" }}>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>
        Book Details
      </button>

      <button onClick={() => setView("blog")}>
        Blog Details
      </button>

      <button onClick={() => setView("course")}>
        Course Details
      </button>

      <hr />

      {view === "book" && <BookDetails />}
      {view === "blog" && <BlogDetails />}
      {view === "course" && <CourseDetails />}
    </div>
  );
}

export default App;