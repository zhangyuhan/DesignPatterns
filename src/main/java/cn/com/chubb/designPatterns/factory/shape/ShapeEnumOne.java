package cn.com.chubb.designPatterns.factory.shape;

public enum ShapeEnumOne {
	CIRCLE("Circle"),RECTANGLE("Rectangle"),SQUARE("Square");
	
	@Override
	public String toString() {
		return path+name;
	}
	
	// 成员变量  
    private String name; 
    // 绝对路径
    private String path = "cn.com.chubb.designPattern.factory.shape.";
    
    
    // 构造方法  
    private ShapeEnumOne(String name) {  
        this.name = name;  
    }  
    
    // 普通方法  
    public static ShapeEnumOne getName(String name) {  
        for (ShapeEnumOne c : ShapeEnumOne.values()) {  
            if (c.getName() == name) {  
                return c;  
            }  
        }  
        return null;  
    }  
    
    // get set 方法  
    public String getName() {  
        return name;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    } 
    
    
   
}
