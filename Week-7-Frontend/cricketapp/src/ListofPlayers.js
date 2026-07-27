import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 80 },
    { name: "Gill", score: 65 },
    { name: "Rahul", score: 72 },
    { name: "Hardik", score: 68 },
    { name: "Jadeja", score: 88 },
    { name: "Ashwin", score: 55 },
    { name: "Bumrah", score: 91 },
    { name: "Shami", score: 60 },
    { name: "Siraj", score: 75 },
    { name: "Iyer", score: 85 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>

      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;