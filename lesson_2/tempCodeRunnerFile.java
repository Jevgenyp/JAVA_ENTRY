for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - i - 1)) {
            // Если символы не совпадают, то строка не является палиндромом
                return false;
            }
        }