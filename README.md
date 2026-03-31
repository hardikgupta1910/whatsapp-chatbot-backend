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
git clone https://github.com/your-username/whatsapp-chatbot-springboot.git
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
https://your-app.onrender.com/webhook
```

---

## 📷 Screenshots

(Add screenshots of Postman request, response, and console logs here)

---

## 🎥 Demo Video

(Add your 2–3 minute demo video link here)

---

## 👨‍💻 Author

Hardik Gupta
