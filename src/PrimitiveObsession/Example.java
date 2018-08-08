PROBLEMA:
String id = product.getId();
if (isValid(id)) {
  ...
}


SOLUCIÓN:
ProductId id = product.getId();
if (id.isValid()) {
  ...
}

class ProductId {

  public boolean isValid() {
    ...
  }
}