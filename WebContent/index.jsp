<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./assets/styles/index.css">
  <title>Form Image</title>
</head>
<body>
  <header>
    <div class="logos">
      <img src="./assets/images/hapvida-logo.png" alt="Logo da HapVida">
      <img src="./assets/images/notreDame_logo.png" alt="Logo da Notredame">
    </div>
    
  </header>

  <section>
    <img src="./assets/images/form.png" alt="Ilustração de um homem segurando um formulário">

    <form class="area_de_envio" action="Prediction" method="POST">
      <h1>Anexe aqui o exame que você realizou</h1>
      <img src="./assets/images/search.png" alt="">
      <input type="text" name="url_image" id="exame" placeholder="Insira a URL da imagem aqui">
      <button class="btn" type="submit">Enviar</button>
    </form>
    
  </section>

</body>
</html>