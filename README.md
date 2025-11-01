# TD — Collaboration, CI/CD, SonarCloud et Déploiement

> Dépôt public de démarrage pour le TD. Les étudiant·e·s ne configurent rien côté plateformes.

## Badges
<!-- Remplacez <OWNER> et <REPO> après création sur GitHub -->
![Build](https://github.com/<OWNER>/<REPO>/actions/workflows/ci.yml/badge.svg)
[![Pages](https://img.shields.io/badge/Docs-GitHub%20Pages-informational)](https://<OWNER>.github.io/<REPO>/)

## Démarrage rapide
```bash
git clone https://github.com/<OWNER>/<REPO>.git
cd <REPO>
mvn -q -B clean verify
```

## Structure
- `src/main/java` — code Java minimal
- `src/test/java` — tests JUnit 5
- `.github/workflows/ci.yml` — CI (build + tests + SonarCloud)
- `.github/workflows/deploy-docs.yml` — Déploiement Javadoc → Pages
- `sonar-project.properties` — clés Sonar (à remplir une seule fois côté enseignant)

## Tâches prévues pour le TD
- Branches, PR, revue, observation de la CI.
- Introduire puis corriger une non-conformité Sonar sur la PR.
- Améliorer le workflow (cache, summary, concurrency).
- Déployer la Javadoc (ou publier un JAR en Release).

---

© Enseignant — Utilisation pédagogique.
