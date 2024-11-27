// Inicializa el estado del juego
const gameState = {
    board: Array(9).fill(''),
    currentPlayer: 'X',
    isGameOver: false
  };
  
  const boardElement = document.getElementById('board');
  const statusElement = document.getElementById('status');
  const resetButton = document.getElementById('reset');
  
  // Función para inicializar el tablero de juego
  function initGame() {
    boardElement.innerHTML = '';
    gameState.board.forEach((_, index) => {
      const cell = document.createElement('div');
      cell.classList.add('cell');
      cell.dataset.index = index;
      cell.addEventListener('click', handleCellClick);
      boardElement.appendChild(cell);
    });
    updateStatus();
  }
  
  // Maneja el clic en una celda del tablero
  function handleCellClick(event) {
    const index = event.target.dataset.index;
  
    // Si la celda ya fue seleccionada o el juego ha terminado, no hacer nada
    if (gameState.board[index] || gameState.isGameOver) return;
  
    // Actualiza la celda con el símbolo del jugador actual
    gameState.board[index] = gameState.currentPlayer;
    updateBoard();
  
    // Verifica si hay un ganador o empate
    if (checkWinner()) {
      gameState.isGameOver = true;
      statusElement.textContent = `Jugador ${gameState.currentPlayer} ha ganado!`;
    } else if (gameState.board.every(cell => cell !== '')) {
      gameState.isGameOver = true;
      statusElement.textContent = 'Empate!';
    } else {
      // Cambia de jugador
      gameState.currentPlayer = gameState.currentPlayer === 'X' ? 'O' : 'X';
      updateStatus();
    }
  }
  
  // Actualiza el contenido del tablero visualmente
  function updateBoard() {
    const cells = boardElement.querySelectorAll('.cell');
    cells.forEach((cell, index) => {
      cell.textContent = gameState.board[index];
    });
  }
  
  // Actualiza el estado de quién es el siguiente en jugar
  function updateStatus() {
    if (!gameState.isGameOver) {
      statusElement.textContent = `Turno del jugador: ${gameState.currentPlayer}`;
    }
  }
  
  // Verifica si hay un ganador
  function checkWinner() {
    const winningCombinations = [
      [0, 1, 2],
      [3, 4, 5], 
      [6, 7, 8],
      [0, 3, 6],
      [1, 4, 7],
      [2, 5, 8],
      [0, 4, 8],
      [2, 4, 6]
    ];
  
    return winningCombinations.some(combo => {
      const [a, b, c] = combo;
      return (
        gameState.board[a] &&
        gameState.board[a] === gameState.board[b] &&
        gameState.board[a] === gameState.board[c]
      );
    });
  }
  
  // Reinicia el juego
  resetButton.addEventListener('click', () => {
    gameState.board = Array(9).fill('');
    gameState.currentPlayer = 'X';
    gameState.isGameOver = false;
    updateBoard();
    updateStatus();
  });
  
  // Inicializa el juego cuando la página carga
  document.addEventListener('DOMContentLoaded', initGame); 