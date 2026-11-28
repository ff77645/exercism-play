class MicroBlog {
    public String truncate(String input) {
        int codeLen = 5;
        // 计算字符串码点是否小于要截取的长度
        if(input.codePointCount(0,input.length()) <= codeLen) return input;
        // 计算第五N码点所在位置索引
        int endIndex = input.offsetByCodePoints(0,codeLen);
        return input.substring(0,endIndex);
    }
}
