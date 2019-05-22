# Structural Patterns

## Configuration

### Intention

Rassembler à un seul endroit (le configurateur) une configuration d'objets.

### Motivation

- Cache et factorise l'assemblage dans une unique méthode.
- Évite de distribuer l'assemblage dans les arguments des constructeurs, le code, etc.
- Facilite la documentation
- Rend possible l'observation de la configuration

### Conseil d'implémentation

Cacher autant que possible le composant derrière le composant façade (private, scope, interne, embarqué, contrôle d'accès, ...)

### Patterns liés

Builder (non vu)
