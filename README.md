	Profils utilisateurs (clients, fournisseurs, restaurateurs, admin)

# VegNbio - Microservice utilisateurs

## 📖Table des matières

1. ✅[Introduction](#introduction)
2. 📦[Prérequis](#prérequis)
3. 🧱[Architecture](#architecture)
3. ⚙️[Installation](#installation)
4. 🔧[Configuration](#configuration)
5. 🚀[Utilisation](#utilisation)
6. 🧪[Tests](#tests)
7. 🧑‍💻[Contribuer](#contribuer)
8. 📄[Licence](#licence)
9. 📦[Deploiement](#deploiement)
10. ⭐[Points importants](#Terminaison API)
11. 🔐[Authentification](#Authentification)
12. 🛠️[Dépannage](#Dépannage)


## Introduction

Ce microservice est une composante autonome conçue selon une architecture en couche,
il se concentre uniquement sur les fonctionnalités liées à la gestion des profils utilisateurs 
(clients, fournisseurs, restaurateurs et admin), l'authentification, l'inscription, les rôles& permissions,
ainsi que les token .


## Prérequis

- Java 17
- Maven 3.9.9
- Docker
- Spring Boot 3.3.5
- Spring Data Mongo
- OpenAPI
- Base de données non relationnelle Mongo
- Spring Security (Basic Auth & JWT)
- RabbitMQ

## Architecture en couche 