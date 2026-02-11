# Fetch AppSec Coding Exercise – Secure Android Implementation

This repository contains the implementation of a technical assessment for the **Android Engineer** position at **Fetch**. Beyond meeting the functional requirements, this project serves as an **AppSec Coding Exercise**, demonstrating production-grade security hardening and resilient architecture.

---

## 🔍 Exercise Overview & AppSec Focus
The goal of this project was to build a robust data-fetching application while strictly adhering to **Security-by-Design** principles. It evaluates expertise in:

* **Secure Coding:** Mitigating common vulnerabilities found in the OWASP Mobile Top 10.
* **Threat Mitigation:** Proper handling of third-party SDKs and untrusted remote data.
* **Sensitive Data Protection:** Secure memory management and data isolation.
* **Resilient Networking:** Implementing secure communication channels.



---

## 🔐 Key Security Implementations

### 📡 Secure Network Communication
- **TLS Enforcement:** All remote data fetching is strictly enforced over **HTTPS** via a custom Network Security Configuration to prevent Man-in-the-Middle (MitM) attacks.
- **Input Sanitization:** Implemented strictly-typed JSON parsing (GSON) to prevent type-confusion attacks and ensure data integrity from remote endpoints.

### 🛡️ Application Hardening (Static Analysis)
- **Obfuscation & R8:** Optimized with **ProGuard/R8** rules to protect business logic, strip sensitive metadata, and hinder reverse engineering.
- **Manifest Security:** Explicitly disabled `android:allowBackup` and non-essential exported components to reduce the application's attack surface.

### 🛠️ Runtime Resilience
- **State Management:** Utilized **StateFlow** and **ViewModel** for lifecycle-aware data handling, ensuring that data is cleared from memory when no longer needed.
- **Privacy-Preserving Logging:** Integrated a release-build tree that automatically strips all debug logs to prevent sensitive information leakage in production environments.

---

## 🏗️ Architecture & Technical Stack

The project follows the **MVVM (Model-View-ViewModel)** pattern combined with **Clean Architecture** to ensure a clear separation of concerns.

- **Language:** Kotlin & Coroutines
- **Networking:** Retrofit2 & GSON
- **UI:** Material3 & Adaptive Layouts
- **Audit Tools used for validation:** MobSF, Jadx-GUI, Burp Suite.



---

## 🚀 Installation & Security Review

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/nikolaivetrik24062010/FetchApp.git](https://github.com/nikolaivetrik24062010/FetchApp.git)
Gemini said
Николай, отличный ход. Упоминание того, что проект был частью технического отсева в Fetch, сразу повышает твой статус — это доказывает, что твоим кодом интересовались крупные игроки рынка.

Я объединил оба описания, чтобы проект выглядел как профессиональное тестовое задание с глубоким уклоном в безопасность.

Вот готовый Markdown для твоего репозитория FetchApp:

Markdown
# Fetch AppSec Coding Exercise – Secure Android Implementation

This repository contains the implementation of a technical assessment for the **Android Engineer** position at **Fetch**. Beyond meeting the functional requirements, this project serves as an **AppSec Coding Exercise**, demonstrating production-grade security hardening and resilient architecture.

---

## 🔍 Exercise Overview & AppSec Focus
The goal of this project was to build a robust data-fetching application while strictly adhering to **Security-by-Design** principles. It evaluates expertise in:

* **Secure Coding:** Mitigating common vulnerabilities found in the OWASP Mobile Top 10.
* **Threat Mitigation:** Proper handling of third-party SDKs and untrusted remote data.
* **Sensitive Data Protection:** Secure memory management and data isolation.
* **Resilient Networking:** Implementing secure communication channels.



---

## 🔐 Key Security Implementations

### 📡 Secure Network Communication
- **TLS Enforcement:** All remote data fetching is strictly enforced over **HTTPS** via a custom Network Security Configuration to prevent Man-in-the-Middle (MitM) attacks.
- **Input Sanitization:** Implemented strictly-typed JSON parsing (GSON) to prevent type-confusion attacks and ensure data integrity from remote endpoints.

### 🛡️ Application Hardening (Static Analysis)
- **Obfuscation & R8:** Optimized with **ProGuard/R8** rules to protect business logic, strip sensitive metadata, and hinder reverse engineering.
- **Manifest Security:** Explicitly disabled `android:allowBackup` and non-essential exported components to reduce the application's attack surface.

### 🛠️ Runtime Resilience
- **State Management:** Utilized **StateFlow** and **ViewModel** for lifecycle-aware data handling, ensuring that data is cleared from memory when no longer needed.
- **Privacy-Preserving Logging:** Integrated a release-build tree that automatically strips all debug logs to prevent sensitive information leakage in production environments.

---

## 🏗️ Architecture & Technical Stack

The project follows the **MVVM (Model-View-ViewModel)** pattern combined with **Clean Architecture** to ensure a clear separation of concerns.

- **Language:** Kotlin & Coroutines
- **Networking:** Retrofit2 & GSON
- **UI:** Material3 & Adaptive Layouts
- **Audit Tools used for validation:** MobSF, Jadx-GUI, Burp Suite.



---

## 🚀 Installation & Security Review

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/nikolaivetrik24062010/FetchApp.git](https://github.com/nikolaivetrik24062010/FetchApp.git)
2. Open in Android Studio: Sync Gradle and build the project.

3. Run Audit: Build the Release variant and use Jadx-GUI to verify that the application logic is properly obfuscated and secure.

🤝 Author
Nikolai Vetrik – Senior Security Engineer & Mobile Developer 📧 devnikolaivetrik@gmail.com
