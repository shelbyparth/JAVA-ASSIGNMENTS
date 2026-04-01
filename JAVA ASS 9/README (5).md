# 📘 Java Swing

---

# 1. What is Java Swing?

Java Swing is used to build **GUI (Graphical User Interface) applications**.

### 📌 GUI means:

* Interaction using **visual elements**
* No need for command-line input

### ✔ Features:

* Platform independent
* Lightweight
* Flexible UI



---

# 2. What is GUI?

GUI allows interaction using:

* Windows
* Buttons
* Text fields
* Menus

### 📌 Examples:

* ATM Machine
* Calculator
* Login Form

---

# 3. Core Concepts of Swing

A Swing program is based on 3 main parts:

### 🔹 1. Frame (JFrame)

* Main window container
* All components are added inside it

```java id="b1e9zw"
JFrame frame = new JFrame("Title");
```

### Important Methods:

* `setSize()` → window size
* `setVisible(true)` → display window
* `setDefaultCloseOperation()` → close behavior

---

### 🔹 2. Layout Manager

Controls how components are arranged.

#### Types:

| Layout       | Description            |
| ------------ | ---------------------- |
| FlowLayout   | Left → Right (default) |
| BorderLayout | 5 regions              |
| GridLayout   | Rows & columns         |

```java id="1vx2a9"
frame.setLayout(new FlowLayout());
```

---

### 🔹 3. Components (UI Elements)

| Component  | Purpose        |
| ---------- | -------------- |
| JLabel     | Display text   |
| JTextField | User input     |
| JButton    | Perform action |
| JCheckBox  | Selection      |



---

# 4. Steps to Create Swing Program

1. Create JFrame
2. Set size
3. Set layout
4. Create components
5. Add components
6. Make visible

---

# 5. Event Handling (IMPORTANT)

Swing is **event-driven**.

👉 Example: Button click

```java id="j3kx3q"
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // action
    }
});
```

✔ From your code: shows message on button click 

---

# 6. Your Code Breakdown (Very Important)

From your file: 

---

## 🔹 Class Structure

```java id="j6lxyt"
class SwingForm {
```

👉 Uses **OOP approach (better design than typical examples)**

---

## 🔹 Components Used

```java id="4u3zy6"
JFrame frame;
JLabel label;
JTextField textField;
JButton button;
```

---

## 🔹 GUI Creation

```java id="zw1hbd"
frame.setLayout(new FlowLayout());
frame.add(label);
frame.add(textField);
frame.add(button);
```

✔ Arranges components in a row

---

## 🔹 Event Handling

```java id="i0npgi"
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        JOptionPane.showMessageDialog(frame, "Hello " + name);
    }
});
```

✔ Takes input + shows popup

---

## 🔹 Data Update Method

```java id="8d6r0d"
public void updateText(String text) {
    textField.setText(text);
}
```

👉 This is **not taught usually**, but important:

* Shows **dynamic UI update**

---

## 🔹 Main Method

```java id="cfx8vj"
SwingForm form = new SwingForm();
form.createGUI();
form.addEvent();
form.updateText("Type your name here");
```

✔ Separates:

* UI creation
* Logic
* Data

---

# 7. Output

Window contains:

* Label → Enter Name
* Text Field
* Button
* Popup on click


---

# 8. Advantages

* Rich GUI components
* Platform independent
* Customizable

---

# 9. Disadvantages (Important for viva)

* Slower than modern frameworks
* Outdated UI (vs JavaFX)
* More boilerplate code

---

# 🧠 Critical Insight (Important)

Most students treat Swing as:

> “just drag and drop UI”

Wrong.

### Real Understanding:

Swing = **event-driven system**

Flow:

```id="bbj1yb"
User Action → Event → Listener → Code Execution
```

---

# 🚀 Final Summary

* `JFrame` → main window
* Layout → arrangement
* Components → UI elements
* Event → user interaction
* Listener → handles event
