public class com.wiyun.engine.utils.TargetSelector {
	 /* .source "TargetSelector.java" */
	 /* # instance fields */
	 private Boolean isClass;
	 private java.lang.Object mArgs;
	 private java.lang.reflect.Method mMethod;
	 private java.lang.String mSelector;
	 private java.lang.Object mTarget;
	 /* # direct methods */
	 public com.wiyun.engine.utils.TargetSelector ( ) {
		 /* .locals 1 */
		 /* .param p1, "target" # Ljava/lang/Object; */
		 /* .param p2, "selector" # Ljava/lang/String; */
		 /* .param p3, "args" # [Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 41 */
		 this.mTarget = p1;
		 /* .line 42 */
		 this.mSelector = p2;
		 /* .line 43 */
		 this.mArgs = p3;
		 /* .line 44 */
		 v0 = this.mTarget;
		 /* instance-of v0, v0, Ljava/lang/Class; */
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
		 /* .line 46 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
		 /* .line 47 */
		 return;
	 } // .end method
	 private void resolve ( ) {
		 /* .locals 15 */
		 /* .prologue */
		 int v14 = 0; // const/4 v14, 0x0
		 /* .line 50 */
		 v11 = this.mTarget;
		 if ( v11 != null) { // if-eqz v11, :cond_0
			 v11 = this.mSelector;
			 /* if-nez v11, :cond_1 */
			 /* .line 175 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 54 */
} // :cond_1
v11 = this.mSelector;
/* const/16 v12, 0x28 */
v9 = (( java.lang.String ) v11 ).indexOf ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/String;->indexOf(I)I
/* .line 55 */
/* .local v9, "index":I */
int v11 = -1; // const/4 v11, -0x1
/* if-ne v9, v11, :cond_3 */
/* .line 57 */
try { // :try_start_0
	 /* iget-boolean v11, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
	 if ( v11 != null) { // if-eqz v11, :cond_2
		 v11 = this.mTarget;
		 /* check-cast v11, Ljava/lang/Class; */
		 /* move-object v5, v11 */
		 /* .line 58 */
		 /* .local v5, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
	 } // :goto_1
	 v11 = this.mSelector;
	 int v12 = 0; // const/4 v12, 0x0
	 /* new-array v12, v12, [Ljava/lang/Class; */
	 (( java.lang.Class ) v5 ).getMethod ( v11, v12 ); // invoke-virtual {v5, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 this.mMethod = v11;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 59 */
} // .end local v5 # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
/* :catch_0 */
/* move-exception v6 */
/* .line 60 */
/* .local v6, "e":Ljava/lang/Exception; */
final String v11 = "libwiengine"; // const-string v11, "libwiengine"
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "unable to find method: "; // const-string v13, "unable to find method: "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v13 = this.mSelector;
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v11,v12 );
/* .line 57 */
} // .end local v6 # "e":Ljava/lang/Exception;
} // :cond_2
try { // :try_start_1
v11 = this.mTarget;
(( java.lang.Object ) v11 ).getClass ( ); // invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 64 */
} // :cond_3
v11 = this.mSelector;
/* add-int/lit8 v12, v9, 0x1 */
v13 = this.mSelector;
v13 = (( java.lang.String ) v13 ).length ( ); // invoke-virtual {v13}, Ljava/lang/String;->length()I
/* add-int/lit8 v13, v13, -0x1 */
(( java.lang.String ) v11 ).substring ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 65 */
/* .local v3, "argStr":Ljava/lang/String; */
final String v11 = ","; // const-string v11, ","
(( java.lang.String ) v3 ).split ( v11 ); // invoke-virtual {v3, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 66 */
/* .local v4, "arguments":[Ljava/lang/String; */
/* array-length v11, v4 */
/* new-array v2, v11, [Ljava/lang/Class; */
/* .line 67 */
/* .local v2, "argClasses":[Ljava/lang/Class; */
int v8 = 0; // const/4 v8, 0x0
/* .local v8, "i":I */
} // :goto_2
/* array-length v11, v4 */
/* if-lt v8, v11, :cond_4 */
/* .line 168 */
try { // :try_start_2
v11 = this.mSelector;
int v12 = 0; // const/4 v12, 0x0
(( java.lang.String ) v11 ).substring ( v12, v9 ); // invoke-virtual {v11, v12, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 169 */
/* .local v7, "func":Ljava/lang/String; */
/* iget-boolean v11, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
if ( v11 != null) { // if-eqz v11, :cond_2a
v11 = this.mTarget;
/* check-cast v11, Ljava/lang/Class; */
/* move-object v5, v11 */
/* .line 170 */
/* .restart local v5 # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
} // :goto_3
(( java.lang.Class ) v5 ).getMethod ( v7, v2 ); // invoke-virtual {v5, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
this.mMethod = v11;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 171 */
} // .end local v5 # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v7 # "func":Ljava/lang/String;
/* :catch_1 */
/* move-exception v6 */
/* .line 172 */
/* .restart local v6 # "e":Ljava/lang/Exception; */
final String v11 = "libwiengine"; // const-string v11, "libwiengine"
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "unable to find method: "; // const-string v13, "unable to find method: "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v13 = this.mSelector;
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v11,v12 );
/* goto/16 :goto_0 */
/* .line 68 */
} // .end local v6 # "e":Ljava/lang/Exception;
} // :cond_4
/* aget-object v11, v4, v8 */
(( java.lang.String ) v11 ).trim ( ); // invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 69 */
/* .local v0, "a":Ljava/lang/String; */
final String v11 = "..."; // const-string v11, "..."
v10 = (( java.lang.String ) v0 ).endsWith ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* .line 70 */
/* .local v10, "isVar":Z */
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 71 */
v11 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v11, v11, -0x3 */
(( java.lang.String ) v0 ).substring ( v14, v11 ); // invoke-virtual {v0, v14, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 74 */
} // :cond_5
if ( v10 != null) { // if-eqz v10, :cond_17
/* .line 75 */
final String v11 = "int"; // const-string v11, "int"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_6
/* .line 76 */
/* const-class v11, [I */
/* aput-object v11, v2, v8 */
/* .line 67 */
} // :goto_4
/* add-int/lit8 v8, v8, 0x1 */
/* .line 77 */
} // :cond_6
final String v11 = "char"; // const-string v11, "char"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_7
/* .line 78 */
/* const-class v11, [C */
/* aput-object v11, v2, v8 */
/* .line 79 */
} // :cond_7
final String v11 = "boolean"; // const-string v11, "boolean"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_8
/* .line 80 */
/* const-class v11, [Z */
/* aput-object v11, v2, v8 */
/* .line 81 */
} // :cond_8
final String v11 = "long"; // const-string v11, "long"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_9
/* .line 82 */
/* const-class v11, [J */
/* aput-object v11, v2, v8 */
/* .line 83 */
} // :cond_9
final String v11 = "float"; // const-string v11, "float"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_a
/* .line 84 */
/* const-class v11, [F */
/* aput-object v11, v2, v8 */
/* .line 85 */
} // :cond_a
final String v11 = "double"; // const-string v11, "double"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_b
/* .line 86 */
/* const-class v11, [D */
/* aput-object v11, v2, v8 */
/* .line 87 */
} // :cond_b
final String v11 = "byte"; // const-string v11, "byte"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_c
/* .line 88 */
/* const-class v11, [B */
/* aput-object v11, v2, v8 */
/* .line 89 */
} // :cond_c
final String v11 = "short"; // const-string v11, "short"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_d
/* .line 90 */
/* const-class v11, [S */
/* aput-object v11, v2, v8 */
/* .line 91 */
} // :cond_d
final String v11 = "Integer"; // const-string v11, "Integer"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_e
/* .line 92 */
/* const-class v11, [Ljava/lang/Integer; */
/* aput-object v11, v2, v8 */
/* .line 93 */
} // :cond_e
final String v11 = "Short"; // const-string v11, "Short"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_f
/* .line 94 */
/* const-class v11, [Ljava/lang/Short; */
/* aput-object v11, v2, v8 */
/* .line 95 */
} // :cond_f
final String v11 = "Float"; // const-string v11, "Float"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_10
/* .line 96 */
/* const-class v11, [Ljava/lang/Float; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 97 */
} // :cond_10
final String v11 = "Double"; // const-string v11, "Double"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_11
/* .line 98 */
/* const-class v11, [Ljava/lang/Double; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 99 */
} // :cond_11
final String v11 = "Byte"; // const-string v11, "Byte"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_12
/* .line 100 */
/* const-class v11, [Ljava/lang/Byte; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 101 */
} // :cond_12
final String v11 = "Long"; // const-string v11, "Long"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_13
/* .line 102 */
/* const-class v11, [Ljava/lang/Long; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 103 */
} // :cond_13
final String v11 = "Void"; // const-string v11, "Void"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_14
/* .line 104 */
/* const-class v11, [Ljava/lang/Void; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 105 */
} // :cond_14
final String v11 = "String"; // const-string v11, "String"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_15
/* .line 106 */
/* const-class v11, [Ljava/lang/String; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 107 */
} // :cond_15
final String v11 = "Object"; // const-string v11, "Object"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_16
/* .line 108 */
/* const-class v11, [Ljava/lang/Object; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 110 */
} // :cond_16
/* new-instance v11, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v12 = "[]"; // const-string v12, "[]"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 112 */
/* .local v1, "aArray":Ljava/lang/String; */
try { // :try_start_3
java.lang.Class .forName ( v1 );
/* aput-object v11, v2, v8 */
/* :try_end_3 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_3 ..:try_end_3} :catch_2 */
/* goto/16 :goto_4 */
/* .line 113 */
/* :catch_2 */
/* move-exception v6 */
/* .line 115 */
/* .local v6, "e":Ljava/lang/ClassNotFoundException; */
/* new-instance v11, Ljava/lang/IllegalArgumentException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Illegel selector, can\'t find class for name: "; // const-string v13, "Illegel selector, can\'t find class for name: "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v1 ); // invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 119 */
} // .end local v1 # "aArray":Ljava/lang/String;
} // .end local v6 # "e":Ljava/lang/ClassNotFoundException;
} // :cond_17
final String v11 = "int"; // const-string v11, "int"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_18
/* .line 120 */
v11 = java.lang.Integer.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 121 */
} // :cond_18
final String v11 = "char"; // const-string v11, "char"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_19
/* .line 122 */
v11 = java.lang.Character.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 123 */
} // :cond_19
final String v11 = "boolean"; // const-string v11, "boolean"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1a
/* .line 124 */
v11 = java.lang.Boolean.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 125 */
} // :cond_1a
final String v11 = "long"; // const-string v11, "long"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1b
/* .line 126 */
v11 = java.lang.Long.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 127 */
} // :cond_1b
final String v11 = "float"; // const-string v11, "float"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1c
/* .line 128 */
v11 = java.lang.Float.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 129 */
} // :cond_1c
final String v11 = "double"; // const-string v11, "double"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1d
/* .line 130 */
v11 = java.lang.Double.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 131 */
} // :cond_1d
final String v11 = "byte"; // const-string v11, "byte"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1e
/* .line 132 */
v11 = java.lang.Byte.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 133 */
} // :cond_1e
final String v11 = "short"; // const-string v11, "short"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1f
/* .line 134 */
v11 = java.lang.Short.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 135 */
} // :cond_1f
final String v11 = "void"; // const-string v11, "void"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_20
/* .line 136 */
v11 = java.lang.Void.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 137 */
} // :cond_20
final String v11 = "Integer"; // const-string v11, "Integer"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_21
/* .line 138 */
v11 = java.lang.Integer.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 139 */
} // :cond_21
final String v11 = "Short"; // const-string v11, "Short"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_22
/* .line 140 */
v11 = java.lang.Short.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 141 */
} // :cond_22
final String v11 = "Float"; // const-string v11, "Float"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_23
/* .line 142 */
v11 = java.lang.Float.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 143 */
} // :cond_23
final String v11 = "Double"; // const-string v11, "Double"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_24
/* .line 144 */
v11 = java.lang.Double.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 145 */
} // :cond_24
final String v11 = "Byte"; // const-string v11, "Byte"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_25
/* .line 146 */
v11 = java.lang.Byte.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 147 */
} // :cond_25
final String v11 = "Long"; // const-string v11, "Long"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_26
/* .line 148 */
v11 = java.lang.Long.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 149 */
} // :cond_26
final String v11 = "Void"; // const-string v11, "Void"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_27
/* .line 150 */
v11 = java.lang.Void.TYPE;
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 151 */
} // :cond_27
final String v11 = "String"; // const-string v11, "String"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_28
/* .line 152 */
/* const-class v11, Ljava/lang/String; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 153 */
} // :cond_28
final String v11 = "Object"; // const-string v11, "Object"
v11 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_29
/* .line 154 */
/* const-class v11, Ljava/lang/Object; */
/* aput-object v11, v2, v8 */
/* goto/16 :goto_4 */
/* .line 157 */
} // :cond_29
try { // :try_start_4
java.lang.Class .forName ( v0 );
/* aput-object v11, v2, v8 */
/* :try_end_4 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_4 ..:try_end_4} :catch_3 */
/* goto/16 :goto_4 */
/* .line 158 */
/* :catch_3 */
/* move-exception v6 */
/* .line 160 */
/* .restart local v6 # "e":Ljava/lang/ClassNotFoundException; */
/* new-instance v11, Ljava/lang/IllegalArgumentException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Illegel selector, can\'t find class for name: "; // const-string v13, "Illegel selector, can\'t find class for name: "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v0 ); // invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 169 */
} // .end local v0 # "a":Ljava/lang/String;
} // .end local v6 # "e":Ljava/lang/ClassNotFoundException;
} // .end local v10 # "isVar":Z
/* .restart local v7 # "func":Ljava/lang/String; */
} // :cond_2a
try { // :try_start_5
v11 = this.mTarget;
(( java.lang.Object ) v11 ).getClass ( ); // invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
/* goto/16 :goto_3 */
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
/* .line 334 */
/* instance-of v0, p1, Lcom/wiyun/engine/utils/TargetSelector; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 335 */
(( com.wiyun.engine.utils.TargetSelector ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/TargetSelector;->toString()Ljava/lang/String;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 337 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object getArguments ( ) {
/* .locals 1 */
/* .prologue */
/* .line 319 */
v0 = this.mArgs;
} // .end method
public java.lang.String getSelector ( ) {
/* .locals 1 */
/* .prologue */
/* .line 310 */
v0 = this.mSelector;
} // .end method
public java.lang.Object getTarget ( ) {
/* .locals 1 */
/* .prologue */
/* .line 301 */
v0 = this.mTarget;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 329 */
(( com.wiyun.engine.utils.TargetSelector ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/TargetSelector;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public void insertArgument ( Integer p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 9 */
/* .param p1, "index" # I */
/* .param p2, "type" # Ljava/lang/String; */
/* .param p3, "arg" # Ljava/lang/Object; */
/* .prologue */
/* const/16 v8, 0x28 */
int v7 = 0; // const/4 v7, 0x0
/* .line 206 */
/* if-gez p1, :cond_0 */
v5 = this.mArgs;
/* array-length v5, v5 */
/* if-le p1, v5, :cond_0 */
/* .line 246 */
} // :goto_0
return;
/* .line 210 */
} // :cond_0
v5 = this.mArgs;
/* if-nez v5, :cond_1 */
/* .line 211 */
int v5 = 1; // const/4 v5, 0x1
/* new-array v5, v5, [Ljava/lang/Object; */
/* .line 212 */
/* aput-object p3, v5, v7 */
/* .line 211 */
this.mArgs = v5;
/* .line 226 */
} // :goto_1
v5 = this.mSelector;
v3 = (( java.lang.String ) v5 ).indexOf ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(I)I
/* .line 227 */
/* .local v3, "p":I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v3, v5, :cond_5 */
/* .line 228 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v5 = this.mSelector;
/* invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 229 */
/* .local v0, "buf":Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v0 ).append ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v6, 0x29 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 230 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.mSelector = v5;
/* .line 245 */
} // :goto_2
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
/* .line 215 */
} // .end local v0 # "buf":Ljava/lang/StringBuilder;
} // .end local v3 # "p":I
} // :cond_1
v5 = this.mArgs;
/* array-length v5, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* new-array v4, v5, [Ljava/lang/Object; */
/* .line 216 */
/* .local v4, "tmp":[Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_3
/* if-lt v1, p1, :cond_2 */
/* .line 218 */
/* aput-object p3, v4, p1 */
/* .line 219 */
/* add-int/lit8 v1, p1, 0x1 */
} // :goto_4
/* array-length v5, v4 */
/* if-lt v1, v5, :cond_3 */
/* .line 222 */
this.mArgs = v4;
/* .line 217 */
} // :cond_2
v5 = this.mArgs;
/* aget-object v5, v5, v1 */
/* aput-object v5, v4, v1 */
/* .line 216 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 220 */
} // :cond_3
v5 = this.mArgs;
/* add-int/lit8 v6, v1, -0x1 */
/* aget-object v5, v5, v6 */
/* aput-object v5, v4, v1 */
/* .line 219 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 234 */
} // .end local v1 # "i":I
} // .end local v4 # "tmp":[Ljava/lang/Object;
/* .restart local v3 # "p":I */
} // :cond_4
v5 = this.mSelector;
/* const/16 v6, 0x2c */
v3 = (( java.lang.String ) v5 ).indexOf ( v6, v3 ); // invoke-virtual {v5, v6, v3}, Ljava/lang/String;->indexOf(II)I
/* move v2, p1 */
/* .line 233 */
} // .end local p1 # "index":I
/* .local v2, "index":I */
} // :goto_5
/* add-int/lit8 p1, v2, -0x1 */
} // .end local v2 # "index":I
/* .restart local p1 # "index":I */
/* if-gtz v2, :cond_4 */
/* .line 238 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 239 */
/* .restart local v0 # "buf":Ljava/lang/StringBuilder; */
v5 = this.mSelector;
/* add-int/lit8 v6, v3, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v5, v7, v6 ); // invoke-virtual {v0, v5, v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
/* .line 240 */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = this.mSelector;
/* add-int/lit8 v7, v3, 0x1 */
v8 = this.mSelector;
v8 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
(( java.lang.StringBuilder ) v5 ).append ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
/* .line 241 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.mSelector = v5;
} // .end local v0 # "buf":Ljava/lang/StringBuilder;
} // :cond_5
/* move v2, p1 */
} // .end local p1 # "index":I
/* .restart local v2 # "index":I */
} // .end method
public void invoke ( ) {
/* .locals 5 */
/* .prologue */
/* .line 181 */
v2 = this.mMethod;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 183 */
try { // :try_start_0
/* iget-boolean v2, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 184 */
v2 = this.mMethod;
int v3 = 0; // const/4 v3, 0x0
v4 = this.mArgs;
(( java.lang.reflect.Method ) v2 ).invoke ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 196 */
} // :cond_0
} // :goto_0
return;
/* .line 186 */
} // :cond_1
v2 = this.mMethod;
v3 = this.mTarget;
v4 = this.mArgs;
(( java.lang.reflect.Method ) v2 ).invoke ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 187 */
/* :catch_0 */
/* move-exception v1 */
/* .line 189 */
/* .local v1, "e":Ljava/lang/reflect/InvocationTargetException; */
(( java.lang.reflect.InvocationTargetException ) v1 ).getCause ( ); // invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
/* .line 190 */
/* .local v0, "cause":Ljava/lang/Throwable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 191 */
/* new-instance v2, Ljava/lang/RuntimeException; */
/* invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v2 */
/* .line 192 */
} // .end local v0 # "cause":Ljava/lang/Throwable;
} // .end local v1 # "e":Ljava/lang/reflect/InvocationTargetException;
/* :catch_1 */
/* move-exception v1 */
/* .line 193 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v2 = "libwiengine"; // const-string v2, "libwiengine"
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v3 );
} // .end method
public void setArgument ( Integer p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .param p2, "arg" # Ljava/lang/Object; */
/* .prologue */
/* .line 255 */
v0 = this.mArgs;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 256 */
/* if-ltz p1, :cond_0 */
v0 = this.mArgs;
/* array-length v0, v0 */
/* if-ge p1, v0, :cond_0 */
/* .line 257 */
v0 = this.mArgs;
/* aput-object p2, v0, p1 */
/* .line 260 */
} // :cond_0
return;
} // .end method
void setDelta ( Float p0 ) {
/* .locals 3 */
/* .param p1, "arg" # F */
/* .prologue */
/* .line 268 */
v0 = this.mArgs;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mArgs;
/* array-length v0, v0 */
/* if-lez v0, :cond_0 */
/* .line 269 */
v0 = this.mArgs;
int v1 = 0; // const/4 v1, 0x0
java.lang.Float .valueOf ( p1 );
/* aput-object v2, v0, v1 */
/* .line 273 */
} // :goto_0
return;
/* .line 271 */
} // :cond_0
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
final String v1 = "TargetSelector doesn\'t have arguments, can\'t set first argument as delta"; // const-string v1, "TargetSelector doesn\'t have arguments, can\'t set first argument as delta"
android.util.Log .w ( v0,v1 );
} // .end method
public void setSelector ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "selector" # Ljava/lang/String; */
/* .prologue */
/* .line 281 */
this.mSelector = p1;
/* .line 282 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
/* .line 283 */
return;
} // .end method
public void setTarget ( java.lang.Object p0 ) {
/* .locals 0 */
/* .param p1, "target" # Ljava/lang/Object; */
/* .prologue */
/* .line 291 */
this.mTarget = p1;
/* .line 292 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
/* .line 293 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 324 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mTarget;
/* check-cast v0, Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // :goto_0
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* const/16 v0, 0x2e */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v1 = this.mSelector;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
v0 = this.mTarget;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // .end method
