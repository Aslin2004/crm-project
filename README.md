# CRM Management System  
A simple and modern Customer Relationship Management (CRM) application built with React.js (frontend) and Java , Spring Boot, Maven (backend).  
This project includes customer creation, listing, editing, and deletion with a clean UI .

---

## 🚀 Tech Stack

### 🔹 Frontend
- React.js  
- Axios  
- Modern CSS (Custom UI)  

### 🔹 Backend
- Java 
- Spring Boot
- Maven  
- MongoDB Atlas  
- Mongoose  

---

## 📁 Project Structure

crm-project/
├── crm-frontend/ → React application (UI)
├── crm-backend/ → Java + SpringBoot
├── README.md

---

## ⚙️ How to Run the Project

### 1️⃣ Start Backend

cd crm-backend
mvn spring-boot:run

Backend runs on:
http://localhost:5000

### 2️⃣ Start Frontend

cd crm-frontend
npm install
npm start

Frontend runs on:
http://localhost:3000
---
## 🔗 API Endpoints (Backend)

### ➤ Create Customer  
`POST /api/customers`

### ➤ Get All Customers  
`GET /api/customers`

### ➤ Update Customer  
`PUT /api/customers/:id`

### ➤ Delete Customer  
`DELETE /api/customers/:id`

---

## 🎯 Features

✔ Add new customers  
✔ View customers in a clean table  
✔ Edit existing customers  
✔ Delete customers  
✔ Fully responsive UI  
✔ Frigate theme-based design  
✔ Connected to MongoDB Atlas  
✔ Uses Axios for API communication  
