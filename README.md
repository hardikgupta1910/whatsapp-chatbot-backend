# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview

This project is a simple backend simulation of a WhatsApp chatbot built using Spring Boot.
It exposes a REST API endpoint that receives messages and responds with predefined replies.

---

## 🚀 Features

* REST API endpoint `/webhook` to handle POST requests
* Accepts JSON input simulating WhatsApp messages
* Returns predefined responses:

  * "Hi" → "Hello"
  * "Bye" → "Goodbye"
* Logs all incoming messages
* Handles invalid or empty inputs gracefully

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

---

## 📡 API Details

### Endpoint

```
POST /webhook
```

### Request Body

```json
{
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello"
}
```

---

## ⚙️ How to Run Locally

1. Clone the repository:

```
git clone https://github.com/hardikgupta1910/whatsapp-chatbot-backend
```

2. Navigate to the project directory:

```
cd whatsapp-chatbot-springboot
```

3. Run the application:

```
mvn spring-boot:run
```

4. The server will start at:

```
http://localhost:8080
```

---

## 🧪 Testing the API

Use Postman or curl:

```
POST http://localhost:8080/webhook
```

Body:

```json
{
  "message": "Hi"
}
```

---

## 📄 Sample Responses

| Input | Output                          |
| ----- | ------------------------------- |
| Hi    | Hello                           |
| Bye   | Goodbye                         |
| Other | Sorry, I didn't understand that |

---

## 📊 Logging

All incoming messages are logged in the console:

```
Incoming message: Hi
```

---

## 🌐 Live Deployment (Optional)

```
https://whatsapp-chatbot-backend-zwoa.onrender.com
```

---

## 📷 Screenshots


## 📷 Screenshots

### 🔹 Postman Request & Response
![postman](https://github.com/user-attachments/assets/a14c1fc3-b883-43f6-9e4b-d43b75ce3951)

![postman](https://github.com/user-attachments/assets/c10fa29f-542a-4f80-b460-e46200ea75f2)


### 🔹 Console Log
![logs](https://github.com/user-attachments/assets/8658bd85-d221-4b05-a68b-ecd0fb96726c)

### 🔹 Application Running
![application](https://github.com/user-attachments/assets/8658bd85-d221-4b05-a68b-ecd0fb96726c)



---




## 🎥 Demo Video

[Watch Demo Video](https://github.com/user-attachments/assets/a6d03de3-99ee-4035-ac9a-e3fbe49790cd)



---

## 👨‍💻 Author

Hardik Gupta
hardikgupta8109@gmail.com
