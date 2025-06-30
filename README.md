# 🧪 Newsletter Signup Automation

![Build](https://github.com/NanaQuaci/Advanced-Week5/actions/workflows/ci.yml/badge.svg)

Automated test suite using Selenium WebDriver, Java, Maven, and GitHub Actions to validate the newsletter sign-up form on [this page](https://collinsadu-newsleterform.vercel.app/).

---

## 🗂️ Project Structure

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── pages         # Page Object Model classes
│   └── test
│       └── java
│           └── tests         # JUnit test classes
├── base                     # WebDriver setup
├── resources                # (Optional) Additional assets
├── pom.xml                  # Maven build configuration
└── .github/workflows/ci.yml # GitHub Actions CI pipeline
```

---

## ▶️ Running Tests Locally

1. Clone this repository:
   ```bash
   git clone https://github.com/NanaQuaci/Advanced-Week5.git
   ```

2. Navigate into the project folder:
   ```bash
   cd Advanced-Week5
   ```

3. Run the tests using Maven:
   ```bash
   mvn test
   ```

✅ Ensure you have:
- Chrome installed
- ChromeDriver matching your browser version in your system `PATH`

---

## 🔔 CI Notifications

Slack notifications are sent automatically after every CI run (on push or pull request) using GitHub Actions.

### 🔐 Setup:
- Create a Slack Incoming Webhook
- Add it as a GitHub secret named `SLACK_WEBHOOK_URL` in your repo

---

## 🛠️ Technologies Used

- ✅ Java 21
- ✅ Selenium WebDriver
- ✅ JUnit 5
- ✅ Maven
- ✅ GitHub Actions CI
- ✅ Slack Notifications

---

## 👤 Author

**[Nana Quaci](https://github.com/NanaQuaci)**

---

