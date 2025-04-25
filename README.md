# 🗂️ Task Scheduler
This project is a Java-based implementation of a task scheduling system that uses Depth-First Search **DFS**, Breadth-First Search **BFS**, and Topological Sort to schedule tasks based on their dependencies. Inspired by course scheduling problems, this algorithm ensures that tasks (or courses) are executed in the correct order, respecting prerequisites and dependencies.
## User Interface
![alt text](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/d94c02d678cf4a6779b4558b7703b457aff1b41f/Images/TaskShedular.png)

## 🔧 Features

- ✅ Add tasks with custom names
- 🔄 Define **prerequisite** tasks
- 🧾 View tasks in a structured **task table**
- ✏️ **Update** or ❌ **Delete** tasks
- 🕒 Click **Schedule** to generate a task execution order
- 📚 Use **DFS** or **BFS** for **topological sorting**

---

## 🖼️ Screenshots

> Replace the image paths (`/screenshots/...`) with actual file paths or image URLs in your repository.

### ➕ Add Task
![Add Task Screenshot](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/main/Images/Screenshot_22.png)

### 🧭 Set Prerequisite
![Set Prerequisite Screenshot](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/main/Images/Screenshot_36.png)
![Set Prerequisite Screenshot](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/main/Images/Screenshot_37.png)

### 🗂️ Task Table & Delete Task
![Task Table Screenshot](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/main/Images/Screenshot_39.png)

### 🕒 Schedule Tasks (Topological Sort)
![Schedule Screenshot](https://github.com/fahad-nakib/task_scheduler_algorithmProject_java/blob/main/Images/Screenshot_38.png)


---

## 🚀 How It Works

1. **Enter total number of tasks**  
   Prompted at the beginning.

2. **Name each task**  
   User provides a name for each task.

3. **Define Prerequisite**  
   Choose dependencies between tasks. A task can depend on one or more other tasks.

4. **View and Manage Tasks**  
   The task list is shown in a table. Update or delete tasks anytime.

5. **Schedule Tasks**  
   Click on the **Schedule** button to generate a task execution order.

6. **DFS / BFS**  
   Click **DFS** or **BFS** buttons to perform specific topological sort approaches.

7. **Delete Task**  
   Click on **Row**, then click on the remove selected row button to delete the particular task.

---

## 🛠️ Tech Stack

- Java
- Java swing

---


