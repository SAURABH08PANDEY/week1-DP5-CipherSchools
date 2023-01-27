public boolean isMeet(int p1, int p2, int s1, int s2) {
  if (p1 > p2 && s1 > s2)
    return false;
  if (p2 > p1 && s2 > s1)
    return false;

  while (p1 >= p2) {
    p1 = p1 + s1;
    p2 = p2 + s2;

    if (p2 == p1) {
      return true;
    }

    if (p2 > p1) {
      return false;
    }

  }

  while (p2 >= p1) {
    p1 = p1 + s1;
    p2 = p2 + s2;

    if (p2 == p1) {
      return true;
    }

    if (p1 > p2) {
      return false;
    }

  }
  return false;

}
