public class Homeworks {
    public static void main(String[] args) {
        System.out.println(21);//xndri hamar@
        int a = 6, b = 8, c = 2;
        if (a > b && a > c) {
            System.out.println(a);
        } else {
            if (b > a && b > c) {
                System.out.println(b);

            } else {
                if (c > a && c > b)
                    System.out.println(c);

            }
        }

        System.out.println("------------------------------------");
        System.out.println(22);
        a = 1;
        b = 2;
        c = 3;

        if (a < b && a < c) {
            System.out.println(a);
        } else {
            if (b < a && b < c) {
                System.out.println(b);

            } else {
                if (c < a && c < b)
                    System.out.println(c);

            }
        }
        System.out.println("------------------------------------");
        System.out.println(23);
        a = 1;
        b = 7;
        c = 9;
        boolean x;
        if ((a == 1) || (b == 1) || (c == 1)) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
        System.out.println("------------------------------------");
        System.out.println(24);
        a = 3;
        b = 2;
        c = 2;
        if ((a == 2) || (b == 2)) {
            System.out.println(x = true);
        } else {
            if ((b == 2) || (c == 2)) {
                System.out.println(x = true);
            } else {
                if ((a == 2) || (c == 2)) {
                    System.out.println(x = true);
                } else {
                    System.out.println(x = false);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(25);
        a = 4;
        b = 7;
        c = 6;
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }
        System.out.println("------------------------------------");
        System.out.println(26);
        a = 7;
        b = 8;
        c = 8;
        if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        System.out.println("------------------------------------");
        System.out.println(27);
        a = 2;
        b = 4;
        c = 6;
        if ((b - a == c - b)) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
        System.out.println("------------------------------------");
        System.out.println(28);
        a = 2;
        b = 4;
        c = 8;
        if ((b / a == c / b)) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
        System.out.println("------------------------------------");
        System.out.println(29);
        a = 1;
        b = 3;
        c = 2;
        if ((a >= b) && (b >= c)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else {
            if ((a >= c) && (c >= b)) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            } else {
                if ((b >= a) && (a >= c)) {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                } else {
                    if ((b >= c) && (c >= a)) {
                        System.out.println(a);
                        System.out.println(c);
                        System.out.println(b);

                    } else {
                        if ((c >= a) && (a >= b)) {
                            System.out.println(b);
                            System.out.println(a);
                            System.out.println(c);
                        } else {
                            System.out.println(a);
                            System.out.println(b);
                            System.out.println(c);
                        }

                    }

                }


            }


        }

        System.out.println("------------------------------------");
        System.out.println(30);
        a = 2;
        b = 4;
        c = 8;
        if ((a >= b) && (b >= c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else {
            if ((a >= c) && (c >= b)) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else {
                if ((b >= a) && (a >= c)) {
                    System.out.println(b);
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    if ((b >= c) && (c >= a)) {
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);

                    } else {
                        if ((c >= a) && (a >= b)) {
                            System.out.println(c);
                            System.out.println(a);
                            System.out.println(b);
                        } else {
                            System.out.println(c);
                            System.out.println(b);
                            System.out.println(a);
                        }

                    }

                }


            }


        }
        System.out.println("------------------------------------");
        System.out.println(31);
        a = 7;
        b = 2;
        c = 8;
        int d = 6;
        if (a > b && (a > c) && (a > d)) {
            System.out.println(a);
        } else {
            if ((b > a) && (b > c) && (b > d)) {
                System.out.println(b);
            } else {
                if ((c > a) && (c > b) && (c > d)) {
                    System.out.println(c);
                } else {
                    System.out.println(d);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(32);
        a = 1;
        b = 7;
        c = 8;
        d = 5;
        if (a < b && (a < c) && (a < d)) {
            System.out.println(a);
        } else {
            if ((b < a) && (b < c) && (b < d)) {
                System.out.println(b);
            } else {
                if ((c < a) && (c < b) && (c < d)) {
                    System.out.println(c);
                } else {
                    System.out.println(d);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(33);
        a = 5;
        b = 2;
        c = 8;
        d = 7;
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }

        System.out.println("------------------------------------");
        System.out.println(34);
        a = 5;
        b = 2;
        c = 1;
        d = 7;
        if (a + b == c + d) {
            System.out.println(x = true);
        } else {
            if (a + d == b + c) {
                System.out.println(x = true);
            } else {
                if (a + c == b + d) {
                    System.out.println(x = true);

                } else {
                    System.out.println(x = false);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(35);
        a = 5;
        b = 2;
        c = 0;
        d = 3;
        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
        System.out.println("------------------------------------");
        System.out.println(36);
        a = 5;
        b = 2;
        c = 0;
        d = 3;
        if ((a % 2 == 1 && b % 2 == 1) || (c % 2 == 1 && d % 2 == 1)) {
            System.out.println(1);
        } else {
            if ((a % 2 == 1 && d % 2 == 1) || (b % 2 == 1 && c % 2 == 1)) {
                System.out.println(1);
            } else {
                if ((a % 2 == 1 && c % 2 == 1) || (b % 2 == 1 && d % 2 == 0)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
        System.out.println("------------------------------------");
        System.out.println(37);
        a = 5;
        b = 7;
        c = 9;
        d = 11;
        if (d - c == b - a) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
        System.out.println("------------------------------------");
        System.out.println(38);
        a = 5;
        b = 15;
        c = 45;
        d = 13;
        if (d / c == b / a) {
            System.out.println(x = true);
        } else {
            System.out.println(x = false);
        }
//////
    }
}

