# SF_ExtraTools

Maintained ExtraTools fork for modern Slimefun servers.

ExtraTools adds utility tools and machines that extend existing Slimefun progression rather than creating a separate tech tree. This fork keeps the original gameplay while modernizing the project for Minecraft 1.21.11+ and current Paper-family servers.

## Compatibility

Primary targets:
- Slimefun Legacy
- Slimefun United

Additional compatibility targets:
- SlimefunGuguProject/Slimefun4
- Original Slimefun4-compatible API implementations

Server software:
- Paper
- Purpur
- Folia
- Leaf

Minecraft target: **1.21.11+**. The project builds with Java 25 while targeting Java 21 bytecode.

Folia support assumes the installed Slimefun implementation itself is Folia-compatible. ExtraTools does not own a global repeating Bukkit scheduler and relies on Slimefun's machine/ticker scheduling for registered machines.

## Dependency policy

This maintained fork avoids external Slimefun utility-library dependencies. Gugu compatibility is provided only through the shared Slimefun addon API.

## Contents

### Tools
- Hammer - pulverizes cobblestone, gravel and dirt into finer materials.

### Machines
- Gold Transmuter - converts between Slimefun gold and vanilla gold.
- Electric Composters - powered composting machines.
- Cobblestone Generator - passively generates cobblestone while powered.
- Vaporizer - produces salt and sulfate materials.
- Concrete Factory - converts concrete powder into concrete in batches.
- Pulverizer - provides an automation-friendly cobblestone-to-sand path.

## Maintenance

Original project by Sfiguz7. This maintained fork is published by `wickidcow` for current Slimefun ecosystems. Please report compatibility issues to this repository rather than the archived/original upstream tracker.
