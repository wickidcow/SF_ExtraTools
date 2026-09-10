<div align="center">

# SF_ExtraTools — Slimefun Legacy
### Preserved ExtraTools gameplay for modern Minecraft

[![Build](https://github.com/wickidcow/SF_ExtraTools/actions/workflows/maven.yml/badge.svg)](https://github.com/wickidcow/SF_ExtraTools/actions/workflows/maven.yml)
[![License](https://img.shields.io/badge/Maintained%20distribution-GPLv3-blue)](https://github.com/wickidcow/Slimefun-Legacy/blob/master/LICENSE)

</div>

> [!IMPORTANT]
> **SF_ExtraTools is an unofficial, independently maintained downstream fork of ExtraTools.** It is maintained by `wickidcow` for AlbionMC and the wider Slimefun community.
>
> **NOT AN OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**

## What stays the same

The Hammer, Gold Transmuter, Electric Composters, Cobblestone Generator, Vaporizer, Concrete Factory and Pulverizer retain their original item IDs, recipes and gameplay role. This fork modernizes compatibility rather than replacing the classic progression.

## 1.2.2 modernization

The Hammer and Pulverizer now understand newer vanilla stone families that naturally fit their existing processing rules:

- Deepslate
- Cobbled Deepslate
- Tuff
- Calcite

The Hammer reduces these stone materials to Gravel, matching its classic stone behavior. The Pulverizer accepts them in its existing stone-to-Sand processing path. Existing recipes and outputs are unchanged.

Release JAR: `SF_ExtraTools1.2.2.jar`

Built with Java 25 targeting Java 21 bytecode. Slimefun Legacy is the primary target, while the shared Slimefun addon API is retained for Slimefun United, SlimefunGuguProject/Slimefun4 and original Slimefun4-compatible implementations. Paper is primary; Purpur, Folia and Leaf are compatibility targets.

This maintained fork has no direct GuizhanLib dependency.

## Credits and license

Original ExtraTools authorship belongs to **Sfiguz7** and contributors. The original MIT notice remains preserved for upstream-derived material. The maintained `wickidcow` distribution and later modifications are distributed under the [GNU General Public License v3.0](https://github.com/wickidcow/Slimefun-Legacy/blob/master/LICENSE).

## Independence and trademarks

**NOT AN OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**

SF_ExtraTools is an independent community project and is not affiliated with, endorsed by, sponsored by, approved by, or operated by Mojang Studios or Microsoft Corporation. Third-party names and trademarks remain the property of their respective owners.
