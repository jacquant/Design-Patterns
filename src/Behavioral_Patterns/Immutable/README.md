# Behavioral Patterns

## Immutable

### Intention

Permet de créer des objets immutables, c'est-à-dire des objets qui une fois créer ne sont plus modifiables (ils 
possèdent seulement des accesseurs et pas de modificateurs).

### Motivation

Ces objets sont plus faciles à maintenir (hash toujours valide) et n'ont pas besoin d'être protéger contre les accès
concurentiels (il faudra juste faire un choix de la version à conserver). Chaque fois que l'on exécute une modification
sur l'objet, on en crée en fait un nouveau.