SELECT Name FROM Pieces; 
SELECT * FROM Providers;
SELECT Piece, AVG(Price) FROM Provides GROUP BY Piece;
SELECT Name FROM Providers WHERE Code IN (SELECT Provider FROM Provides WHERE Piece = 1);
SELECT Name FROM Pieces WHERE Code IN SELECT Piece FROM Provides WHERE Provider = 'HAL');
SELECT Pieces.Name, Providers.Name, Price
  FROM Pieces INNER JOIN Provides ON Pieces.Code = Piece
              INNER JOIN Providers ON Providers.Code = Provider
  WHERE Price =
  (
    SELECT MAX(Price) FROM Provides
    WHERE Piece = Pieces.Code
  );