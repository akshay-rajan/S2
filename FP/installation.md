# Glasgow Haskell Compiler

## Enable Haskell Repositories
```bash
sudo nano /etc/apt/sources.list

deb http://ftp.debian.org/debian buster main
deb http://ftp.debian.org/debian buster-updates main
```
## Update package index

```bash
sudo apt update
```

## Installation

```bash
sudo apt install haskell-platform
```

## Verification

```bash
ghc --version

```

## Interactive Mode

```bash
ghci
```

## Execution

```bash
ghc -o ExecutableName FileName.hs
./ExecutableName
```

