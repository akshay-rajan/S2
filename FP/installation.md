# Glasgow Haskell Compiler

## For Windows (PowerShell)

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force;[System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; try { Invoke-Command -ScriptBlock ([ScriptBlock]::Create((Invoke-WebRequest https://www.haskell.org/ghcup/sh/bootstrap-haskell.ps1 -UseBasicParsing))) -ArgumentList $true } catch { Write-Error $_ }
```

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

