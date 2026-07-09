// Last updated: 7/9/2026, 9:16:20 AM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>(); 
        String[] directories = path.split("/"); 
        for (String dir : directories) { 
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); // join the directories in the stack with slash '/' and add a slash at the beginning
    }
}