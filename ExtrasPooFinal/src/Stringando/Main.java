/*
package Stringando;

public class Main {

    // TITLEIZE
    System.out.println(titleize("uma frase").equals("Uma Frase"));
    System.out.println(titleize("UMA FRASE").equals("Uma Frase"));
    System.out.println(titleize("ANALISE e desenvolvimento DE SISTEMAS").equals("Analise E Desenvolvimento De Sistemas"));
    System.out.println(titleize(""));
     
    // CAMELIZE
    // casos comuns
    System.out.println(camelize("converter objeto").equals("converterObjeto"));
    System.out.println(camelize("CONVERTER OBJETO").equals("converterObjeto"));
    System.out.println(camelize("contas a pagar").equals("contasAPagar"));
    System.out.println(camelize("3contas4a5pagar").equals("3contas4a5pagar"));
    System.out.println(camelize("3contas 4a 5pagar").equals("3contas4a5pagar"));
    // espaços antes/depois tornam a string invalida e devem lançar IllegalArgumentException
    // throw new IllegalArgumentException()
    try { System.out.println(camelize(" converter objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(camelize("converter  objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(camelize("converter objeto "));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    // conversões de outros formatos
    System.out.println(camelize("converter_objeto").equals("converterObjeto"));
    System.out.println(camelize("contas_a_pagar").equals("contasAPagar"));
    System.out.println(camelize("ConverterObjeto").equals("converterObjeto"));
    System.out.println(camelize("ContasAPagar").equals("contasAPagar"));
    System.out.println(camelize("CONVERTER_OBJETO").equals("converterObjeto"));
    System.out.println(camelize("CONTAS_A_PAGAR").equals("contasAPagar"));
     
    // PASCALIZE
    // casos comuns
    System.out.println(pascalize("converter objeto").equals("ConverterObjeto"));
    System.out.println(pascalize("CONVERTER OBJETO").equals("ConverterObjeto"));
    System.out.println(pascalize("contas a pagar").equals("ContasAPagar"));
    System.out.println(pascalize("3contas4a5pagar").equals("3contas4a5pagar"));
    System.out.println(pascalize("3contas 4a 5pagar").equals("3contas4a5pagar"));
    // espaços antes/depois tornam a string invalida e devem lançar IllegalArgumentException
    try { System.out.println(pascalize(" converter objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(pascalize("converter  objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(pascalize("converter objeto "));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    // conversões de outros formatos
    System.out.println(pascalize("converter_objeto").equals("ConverterObjeto"));
    System.out.println(pascalize("contas_a_pagar").equals("ContasAPagar"));
    System.out.println(pascalize("converterObjeto").equals("ConverterObjeto"));
    System.out.println(pascalize("contasAPagar").equals("ContasAPagar"));
    System.out.println(pascalize("CONVERTER_OBJETO").equals("ConverterObjeto"));
    System.out.println(pascalize("CONTAS_A_PAGAR").equals("ContasAPagar"));
     
    // CONSTANTIZE
    // casos comuns
    System.out.println(constantize("converter objeto").equals("CONVERTER_OBJETO"));
    System.out.println(constantize("CONVERTER OBJETO").equals("CONVERTER_OBJETO"));
    System.out.println(constantize("contas a pagar").equals("CONTAS_A_PAGAR"));
    System.out.println(constantize("3contas4a5pagar").equals("3CONTAS4A5PAGAR"));
    System.out.println(constantize("3contas 4a 5pagar").equals("3CONTAS_4A_5PAGAR"));
    // espaços antes/depois tornam a string invalida e devem lançar IllegalArgumentException
    try { System.out.println(constantize(" converter objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(constantize("converter  objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(constantize("converter objeto "));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    // conversões de outros formatos
    System.out.println(constantize("converter_objeto").equals("CONVERTER_OBJETO"));
    System.out.println(constantize("contas_a_pagar").equals("CONTAS_A_PAGAR"));
    System.out.println(constantize("converterObjeto").equals("CONVERTER_OBJETO"));
    System.out.println(constantize("contasAPagar").equals("CONTAS_A_PAGAR"));
    System.out.println(constantize("ConverterObjeto").equals("CONVERTER_OBJETO"));
    System.out.println(constantize("ContasAPagar").equals("CONTAS_A_PAGAR"));
     
    // SNAKEIZE
    // casos comuns
    System.out.println(constantize("converter objeto").equals("converter_objeto"));
    System.out.println(constantize("CONVERTER OBJETO").equals("converter_objeto"));
    System.out.println(constantize("contas a pagar").equals("contas_a_pagar"));
    System.out.println(constantize("3contas4a5pagar").equals("3contas4a5pagar"));
    System.out.println(constantize("3contas 4a 5pagar").equals("3contas_4a_5pagar"));
    // espaços antes/depois tornam a string invalida e devem lançar IllegalArgumentException
    try { System.out.println(constantize(" converter objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(constantize("converter  objeto"));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    try { System.out.println(constantize("converter objeto "));
      System.out.println("false");
    } catch (IllegalArgumentException) {}
    // conversões de outros formatos
    System.out.println(constantize("CONVERTER_OBJETO").equals("converter_objeto"));
    System.out.println(constantize("CONTAS_A_PAGAR").equals("contas_a_pagar"));
    System.out.println(constantize("converterObjeto").equals("converter_objeto"));
    System.out.println(constantize("contasAPagar").equals("contas_a_pagar"));
    System.out.println(constantize("ConverterObjeto").equals("converter_objeto"));
    System.out.println(constantize("ContasAPagar").equals("contas_a_pagar"));
     
    // NORMALIZE
    // casos comuns
    System.out.println(normalize("converter_objeto").equals("converter objeto"));
    System.out.println(normalize("contas_a_pagar").equals("contas a pagar"));
    System.out.println(normalize("CONVERTER_OBJETO").equals("converter objeto"));
    System.out.println(normalize("CONTAS_A_PAGAR").equals("contas a pagar"));
    System.out.println(normalize("converterObjeto").equals("converter objeto"));
    System.out.println(normalize("contasAPagar").equals("contas a pagar"));
    System.out.println(normalize("ConverterObjeto").equals("converter objeto"));
    System.out.println(normalize("ContasAPagar").equals("contas a pagar"));
    // outros (mesma string quando não coincide com outros formatos)
    System.out.println(normalize("converter objeto").equals("converter objeto"));
    System.out.println(normalize("  contas a pagar ").equals("  contas a pagar "));
    System.out.println(normalize("CONVERTER OBJETO").equals("CONVERTER OBJETO"));
    System.out.println(normalize("converter__objeto").equals("converter__objeto"));
	
}
*/