# CRM Management System  
A simple and modern Customer Relationship Management (CRM) application built with **React (frontend)** and **Node.js + Express + MongoDB (backend)**.  
This project includes customer creation, listing, editing, and deletion with a clean UI inspired by **Frigate Engineering Services** (White + Violet theme).

---

## 🚀 Tech Stack

### 🔹 Frontend
- React.js  
- Axios  
- Modern CSS (Custom UI)  
- Frigate theme (#674299)

### 🔹 Backend
- Node.js  
- Express.js  
- MongoDB Atlas  
- Mongoose  

---

## 📁 Project Structure

crm-project/
├── frontend/ → React application (UI)
├── backend/ → Node.js + Express REST API
├── README.md

---

## ⚙️ How to Run the Project

### 1️⃣ Start Backend

cd backend
npm install
npm start


Backend runs on:

http://localhost:5000


### 2️⃣ Start Frontend

cd frontend
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
