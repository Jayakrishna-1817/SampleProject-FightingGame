# Overview

This project is a comprehensive showcase of software architecture, clean coding practices, and advanced design patterns applied to game development in Unity. It is designed to demonstrate a clean, scalable, and event-driven approach to building complex character behaviours.
It leverages powerful libraries such as [VContainer](https://github.com/hadashiA/VContainer) for Dependency Injection (migrated from [Extenject/Zenject](https://github.com/Mathijs-Bakker/Extenject)) and [MessagePipe](https://github.com/Cysharp/MessagePipe) for its high-performance, decoupled event system.

[**Documents**](https://github.com/ATHellboy/SampleProject-FightingGame/tree/master/Docs)

# Key Features
* **Combat System:** A robust combat system designed for extensibility. It supports complex, character-specific attacks.
  * See the [Combat System Documentation](https://github.com/ATHellboy/SampleProject-FightingGame/blob/master/Docs/CombatSystem.pdf)
* **Character Controller:** A responsive character controller built on Unity's Rigidbody and physics engine, including reliable support for sloped surfaces.
* Object Pooling: An object pooling system for managing projectiles and effects, optimizing memory allocation and performance.
  * See the [Object Pooling Documentation](https://github.com/ATHellboy/SampleProject-FightingGame/blob/master/Docs/ObjectPoolingSystem.pdf)
* **State Machine:** A clean and scalable character State Machine for managing player states.
  * See the [State Machine Documentation](https://github.com/ATHellboy/SampleProject-FightingGame/blob/master/Docs/StateMachine.pdf)
* **Custom Editor Attributes:** Custom editor attributes like `ScriptableObjectDropdown` to create a more efficient, designer-friendly workflow in the Unity Inspector.
  * This attribute is also available as a [standalone open-source tool](https://github.com/ATHellboy/ScriptableObjectDropdown)

# Controls
| Control | Player One  | Player Two |
| --- | --- | --- |
| Movement | WASD  | Arrow Keys |
| Jump | Space  | 0 |
| Attack | B  | 1 |
| Powerup | N  | 2 |
| Switch Character | M  | 3 |

* **Bunny Complex Attack:** Attack Button (In Air)
* **Kitty Complex Attack:** Attack Button (After Double Jump)

# MIT License

Copyright (c) 2019 Alireza Tarahomi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
