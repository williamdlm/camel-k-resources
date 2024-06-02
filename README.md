# Camel K Custom Resources Examples

## Descrição

Este repositório contém exemplos de recursos personalizados do Camel K, incluindo pipes e kamelets, bem como alguns recursos do Kubernetes como serviços, todos configurados utilizando YAML. O objetivo é fornecer exemplos práticos e úteis para desenvolvedores que trabalham com Camel K e Kubernetes.

## Estrutura do Repositório

```
├── pipes/
│   ├── example-pipe-1.yaml
│   ├── example-pipe-2.yaml
│   └── ...
├── kamelets/
│   ├── example-kamelet-1.yaml
│   ├── example-kamelet-2.yaml
│   └── ...
├── kubernetes-resources/
│   ├── service-example-1.yaml
│   ├── service-example-2.yaml
│   └── ...
├── README.md
└── LICENSE
```

## Exemplos de Uso

### Pipes

Os pipes do Camel K são utilizados para configurar roteamentos e integrações de maneira simples e declarativa. Abaixo está um exemplo de como aplicar um pipe.

```sh
kubectl apply -f pipes/example-pipe-1.yaml
```

### Kamelets

Os kamelets são blocos de construção reutilizáveis para integrações do Apache Camel K. Abaixo está um exemplo de como aplicar um kamelet.

```sh
kubectl apply -f kamelets/example-kamelet-1.yaml
```

### Serviços Kubernetes

Os arquivos YAML de serviços Kubernetes neste repositório configuram serviços que podem ser usados juntamente com os recursos do Camel K. Abaixo está um exemplo de como aplicar um serviço.

```sh
kubectl apply -f kubernetes-resources/service-example-1.yaml
```

## Contribuindo

Contribuições são bem-vindas! Se você tiver exemplos de recursos personalizados do Camel K ou configurações de serviços Kubernetes que gostaria de compartilhar, siga as etapas abaixo:

1. Faça um fork deste repositório.
2. Crie uma nova branch com a sua feature ou correção: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -am 'Adiciona nova feature'`.
4. Faça push para a branch: `git push origin minha-feature`.
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Recursos Adicionais

- [Documentação do Camel K](https://camel.apache.org/camel-k/latest/)
- [Documentação do Kubernetes](https://kubernetes.io/docs/home/)

## Contato

Para quaisquer perguntas ou suporte, abra uma issue neste repositório.

---

Obrigado por usar nossos exemplos de recursos do Camel K e Kubernetes!
