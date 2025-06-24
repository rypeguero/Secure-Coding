# 🛡️ Artemis Financial - Secure Software Implementation (CS-305)

This project was developed as part of the CS-305 Secure Software Development course. It demonstrates secure software engineering practices by implementing HTTPS communication with an SSL certificate, vulnerability scanning using OWASP Dependency-Check, and secure RESTful API handling.

## 🔍 Project Overview

**Client:** Artemis Financial  
**Objective:** Artemis Financial needed a way to secure their internal Java-based software applications to ensure safe, encrypted communication between client and server systems. The company sought a solution that ensured data confidentiality, integrity, and authenticity via HTTPS and SSL/TLS.

Our task was to assess their application for vulnerabilities and refactor their code to follow secure software development principles using Java and Spring Boot.

## ✅ Deliverables

- Implemented HTTPS encryption using `keystore.p12` and self-signed certificate (`sslserver.cer`)
- Refactored Spring Boot project with HTTPS server configuration (`application.properties`)
- Implemented SHA-256 hashing and RSA key generation
- Added OWASP Dependency-Check plugin in `pom.xml` for vulnerability scanning
- Delivered full working Spring Boot application with SSL

## 🔐 Key Security Practices

- Enabled HTTPS with self-signed SSL certificate
- Applied SHA-256 for integrity validation
- Used RSA for secure key exchange
- Conducted automated dependency vulnerability scanning
- Validated HTTPS endpoints via browser and curl tests

## 🧠 Reflection Questions

**1. Who was the client and what problem were they facing?**  
The client, Artemis Financial, needed their software application to support secure communication protocols to protect customer data. Their system lacked SSL/TLS protection and proper vulnerability analysis.

**2. What did I do well?**  
I effectively implemented SSL using a Java keystore and verified secure HTTPS connections. I also ensured dependencies were scanned for known vulnerabilities using OWASP's tools. Secure coding is vital for protecting sensitive data, building customer trust, and maintaining system integrity.

**3. Which part was challenging or helpful?**  
The most challenging part was configuring Spring Boot to serve HTTPS correctly with a custom keystore and ensuring all dependencies passed security checks. This gave me a strong foundation in real-world software hardening.

**4. How did I add layers of security?**  
I configured SSL encryption, implemented strong hashing (SHA-256), and scanned dependencies. In future work, I would use tools like SonarQube, Snyk, or Burp Suite for more advanced vulnerability analysis and mitigation planning.

**5. How did I validate functionality and security?**  
I tested the application using web browsers, curl, and unit tests to ensure HTTPS was active and functional. After refactoring, I re-ran all tests and ensured no new vulnerabilities appeared in the scan.

**6. What tools or practices will I reuse?**  
I will continue using:
- SSL/TLS with keystores
- OWASP Dependency-Check
- Spring Boot secure configuration best practices
- Git for version control and collaboration

**7. What can I show employers from this project?**  
This project shows my ability to assess vulnerabilities, remediate them with secure code, configure SSL/TLS, and use industry tools for security validation. It's an end-to-end secure software implementation – a strong portfolio artifact for cybersecurity and development roles.

---

## 📁 Key Files

- `HashController.java` – API controller that implements SHA-256 hashing
- `SslServerApplication.java` – Main Spring Boot entry point
- `application.properties` – Server configuration for SSL (port 8443)
- `pom.xml` – Maven configuration with OWASP dependency plugin
- `keystore.p12` & `sslserver.cer` – SSL keystore and certificate (private)

## 🚀 How to Run

1. Download ZipFile
2. Import into IntelliJ or Eclipse as a Maven project.
3. Run `SslServerApplication.java`
4. Visit: `https://localhost:8443/hash?data=HelloWorld`
5. Accept the self-signed certificate warning in your browser

---

**Author:** Ryan Peguero  
**Course:** CS-305 Secure Software Development  

📫 For questions, reach out at [ryan.peguero1@snhu.edu](mailto:ryan.peguero1@snhu.edu)
