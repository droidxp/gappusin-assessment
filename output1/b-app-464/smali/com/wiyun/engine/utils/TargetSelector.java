public class com.wiyun.engine.utils.TargetSelector {
	 /* # instance fields */
	 private Boolean isClass;
	 private java.lang.Object mArgs;
	 private java.lang.reflect.Method mMethod;
	 private java.lang.String mSelector;
	 private java.lang.Object mTarget;
	 /* # direct methods */
	 public com.wiyun.engine.utils.TargetSelector ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mTarget = p1;
		 this.mSelector = p2;
		 this.mArgs = p3;
		 v0 = this.mTarget;
		 /* instance-of v0, v0, Ljava/lang/Class; */
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
		 return;
	 } // .end method
	 private void resolve ( ) {
		 /* .locals 8 */
		 int v1 = 0; // const/4 v1, 0x0
		 v0 = this.mTarget;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mSelector;
			 /* if-nez v0, :cond_1 */
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
v0 = this.mSelector;
/* const/16 v2, 0x28 */
v3 = (( java.lang.String ) v0 ).indexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I
int v0 = -1; // const/4 v0, -0x1
/* if-ne v3, v0, :cond_3 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = this.mTarget;
		 /* check-cast v0, Ljava/lang/Class; */
	 } // :goto_1
	 v1 = this.mSelector;
	 int v2 = 0; // const/4 v2, 0x0
	 /* new-array v2, v2, [Ljava/lang/Class; */
	 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 this.mMethod = v0;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v0 = "libwiengine"; // const-string v0, "libwiengine"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "unable to find method: "; // const-string v2, "unable to find method: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v2 = this.mSelector;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v0,v1 );
} // :cond_2
try { // :try_start_1
	 v0 = this.mTarget;
	 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_3
v0 = this.mSelector;
/* add-int/lit8 v2, v3, 0x1 */
v4 = this.mSelector;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* add-int/lit8 v4, v4, -0x1 */
(( java.lang.String ) v0 ).substring ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v2 = ","; // const-string v2, ","
(( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* array-length v0, v4 */
/* new-array v5, v0, [Ljava/lang/Class; */
/* move v0, v1 */
} // :goto_2
/* array-length v2, v4 */
/* if-lt v0, v2, :cond_4 */
try { // :try_start_2
v0 = this.mSelector;
int v1 = 0; // const/4 v1, 0x0
(( java.lang.String ) v0 ).substring ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
if ( v0 != null) { // if-eqz v0, :cond_2a
	 v0 = this.mTarget;
	 /* check-cast v0, Ljava/lang/Class; */
} // :goto_3
(( java.lang.Class ) v0 ).getMethod ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
this.mMethod = v0;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "unable to find method: "; // const-string v2, "unable to find method: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.mSelector;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* goto/16 :goto_0 */
} // :cond_4
/* aget-object v2, v4, v0 */
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v6 = "..."; // const-string v6, "..."
v6 = (( java.lang.String ) v2 ).endsWith ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
v7 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v7, v7, -0x3 */
(( java.lang.String ) v2 ).substring ( v1, v7 ); // invoke-virtual {v2, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_5
if ( v6 != null) { // if-eqz v6, :cond_17
final String v6 = "int"; // const-string v6, "int"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_6
	 /* const-class v2, [I */
	 /* aput-object v2, v5, v0 */
} // :goto_4
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
final String v6 = "char"; // const-string v6, "char"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_7
/* const-class v2, [C */
/* aput-object v2, v5, v0 */
} // :cond_7
final String v6 = "boolean"; // const-string v6, "boolean"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_8
/* const-class v2, [Z */
/* aput-object v2, v5, v0 */
} // :cond_8
final String v6 = "long"; // const-string v6, "long"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_9
/* const-class v2, [J */
/* aput-object v2, v5, v0 */
} // :cond_9
final String v6 = "float"; // const-string v6, "float"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_a
/* const-class v2, [F */
/* aput-object v2, v5, v0 */
} // :cond_a
final String v6 = "double"; // const-string v6, "double"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_b
/* const-class v2, [D */
/* aput-object v2, v5, v0 */
} // :cond_b
final String v6 = "byte"; // const-string v6, "byte"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_c
/* const-class v2, [B */
/* aput-object v2, v5, v0 */
} // :cond_c
final String v6 = "short"; // const-string v6, "short"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_d
/* const-class v2, [S */
/* aput-object v2, v5, v0 */
} // :cond_d
final String v6 = "Integer"; // const-string v6, "Integer"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_e
/* const-class v2, [Ljava/lang/Integer; */
/* aput-object v2, v5, v0 */
} // :cond_e
final String v6 = "Short"; // const-string v6, "Short"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_f
/* const-class v2, [Ljava/lang/Short; */
/* aput-object v2, v5, v0 */
} // :cond_f
final String v6 = "Float"; // const-string v6, "Float"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_10
/* const-class v2, [Ljava/lang/Float; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_10
final String v6 = "Double"; // const-string v6, "Double"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_11
/* const-class v2, [Ljava/lang/Double; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_11
final String v6 = "Byte"; // const-string v6, "Byte"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_12
/* const-class v2, [Ljava/lang/Byte; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_12
final String v6 = "Long"; // const-string v6, "Long"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_13
/* const-class v2, [Ljava/lang/Long; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_13
final String v6 = "Void"; // const-string v6, "Void"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_14
/* const-class v2, [Ljava/lang/Void; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_14
final String v6 = "String"; // const-string v6, "String"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_15
/* const-class v2, [Ljava/lang/String; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_15
final String v6 = "Object"; // const-string v6, "Object"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_16
/* const-class v2, [Ljava/lang/Object; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_16
/* new-instance v6, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "[]"; // const-string v2, "[]"
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
try { // :try_start_3
java.lang.Class .forName ( v2 );
/* aput-object v6, v5, v0 */
/* :try_end_3 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_3 ..:try_end_3} :catch_2 */
/* goto/16 :goto_4 */
/* :catch_2 */
/* move-exception v0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "Illegel selector, can\'t find class for name: "; // const-string v3, "Illegel selector, can\'t find class for name: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_17
final String v6 = "int"; // const-string v6, "int"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_18
v2 = java.lang.Integer.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_18
final String v6 = "char"; // const-string v6, "char"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_19
v2 = java.lang.Character.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_19
final String v6 = "boolean"; // const-string v6, "boolean"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1a
v2 = java.lang.Boolean.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1a
final String v6 = "long"; // const-string v6, "long"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1b
v2 = java.lang.Long.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1b
final String v6 = "float"; // const-string v6, "float"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1c
v2 = java.lang.Float.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1c
final String v6 = "double"; // const-string v6, "double"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1d
v2 = java.lang.Double.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1d
final String v6 = "byte"; // const-string v6, "byte"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1e
v2 = java.lang.Byte.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1e
final String v6 = "short"; // const-string v6, "short"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1f
v2 = java.lang.Short.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_1f
final String v6 = "void"; // const-string v6, "void"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_20
v2 = java.lang.Void.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_20
final String v6 = "Integer"; // const-string v6, "Integer"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_21
v2 = java.lang.Integer.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_21
final String v6 = "Short"; // const-string v6, "Short"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_22
v2 = java.lang.Short.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_22
final String v6 = "Float"; // const-string v6, "Float"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_23
v2 = java.lang.Float.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_23
final String v6 = "Double"; // const-string v6, "Double"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_24
v2 = java.lang.Double.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_24
final String v6 = "Byte"; // const-string v6, "Byte"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_25
v2 = java.lang.Byte.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_25
final String v6 = "Long"; // const-string v6, "Long"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_26
v2 = java.lang.Long.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_26
final String v6 = "Void"; // const-string v6, "Void"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_27
v2 = java.lang.Void.TYPE;
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_27
final String v6 = "String"; // const-string v6, "String"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_28
/* const-class v2, Ljava/lang/String; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_28
final String v6 = "Object"; // const-string v6, "Object"
v6 = (( java.lang.String ) v6 ).equals ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_29
/* const-class v2, Ljava/lang/Object; */
/* aput-object v2, v5, v0 */
/* goto/16 :goto_4 */
} // :cond_29
try { // :try_start_4
java.lang.Class .forName ( v2 );
/* aput-object v6, v5, v0 */
/* :try_end_4 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_4 ..:try_end_4} :catch_3 */
/* goto/16 :goto_4 */
/* :catch_3 */
/* move-exception v0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "Illegel selector, can\'t find class for name: "; // const-string v3, "Illegel selector, can\'t find class for name: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2a
try { // :try_start_5
v0 = this.mTarget;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
/* goto/16 :goto_3 */
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* instance-of v0, p1, Lcom/wiyun/engine/utils/TargetSelector; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( com.wiyun.engine.utils.TargetSelector ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/TargetSelector;->toString()Ljava/lang/String;
	 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object getArguments ( ) {
/* .locals 1 */
v0 = this.mArgs;
} // .end method
public java.lang.String getSelector ( ) {
/* .locals 1 */
v0 = this.mSelector;
} // .end method
public java.lang.Object getTarget ( ) {
/* .locals 1 */
v0 = this.mTarget;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
(( com.wiyun.engine.utils.TargetSelector ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/TargetSelector;->toString()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public void insertArgument ( Integer p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 6 */
/* const/16 v5, 0x28 */
int v2 = 0; // const/4 v2, 0x0
/* if-gez p1, :cond_0 */
v0 = this.mArgs;
/* array-length v0, v0 */
/* if-le p1, v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = this.mArgs;
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
/* aput-object p3, v0, v2 */
this.mArgs = v0;
} // :goto_1
v0 = this.mSelector;
v0 = (( java.lang.String ) v0 ).indexOf ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(I)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.mSelector;
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x29 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.mSelector = v0;
} // :goto_2
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
} // :cond_1
v0 = this.mArgs;
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, 0x1 */
/* new-array v1, v0, [Ljava/lang/Object; */
/* move v0, v2 */
} // :goto_3
/* if-lt v0, p1, :cond_2 */
/* aput-object p3, v1, p1 */
/* add-int/lit8 v0, p1, 0x1 */
} // :goto_4
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_3 */
this.mArgs = v1;
} // :cond_2
v3 = this.mArgs;
/* aget-object v3, v3, v0 */
/* aput-object v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
v3 = this.mArgs;
/* add-int/lit8 v4, v0, -0x1 */
/* aget-object v3, v3, v4 */
/* aput-object v3, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_4
v3 = this.mSelector;
/* const/16 v4, 0x2c */
v0 = (( java.lang.String ) v3 ).indexOf ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/lang/String;->indexOf(II)I
/* move p1, v1 */
} // :cond_5
/* add-int/lit8 v1, p1, -0x1 */
/* if-gtz p1, :cond_4 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v3 = this.mSelector;
/* add-int/lit8 v4, v0, 0x1 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v2, v4 ); // invoke-virtual {v1, v3, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.mSelector;
/* add-int/lit8 v0, v0, 0x1 */
v4 = this.mSelector;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
(( java.lang.StringBuilder ) v2 ).append ( v3, v0, v4 ); // invoke-virtual {v2, v3, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.mSelector = v0;
} // .end method
public void invoke ( ) {
/* .locals 3 */
v0 = this.mMethod;
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/TargetSelector;->isClass:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mMethod;
int v1 = 0; // const/4 v1, 0x0
v2 = this.mArgs;
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.mMethod;
v1 = this.mTarget;
v2 = this.mArgs;
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getCause ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
/* :catch_1 */
/* move-exception v0 */
final String v1 = "libwiengine"; // const-string v1, "libwiengine"
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
android.util.Log .w ( v1,v0 );
} // .end method
public void setArgument ( Integer p0, java.lang.Object p1 ) {
/* .locals 1 */
v0 = this.mArgs;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-ltz p1, :cond_0 */
v0 = this.mArgs;
/* array-length v0, v0 */
/* if-ge p1, v0, :cond_0 */
v0 = this.mArgs;
/* aput-object p2, v0, p1 */
} // :cond_0
return;
} // .end method
void setDelta ( Float p0 ) {
/* .locals 3 */
v0 = this.mArgs;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mArgs;
/* array-length v0, v0 */
/* if-lez v0, :cond_0 */
v0 = this.mArgs;
int v1 = 0; // const/4 v1, 0x0
java.lang.Float .valueOf ( p1 );
/* aput-object v2, v0, v1 */
} // :goto_0
return;
} // :cond_0
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
final String v1 = "TargetSelector doesn\'t have arguments, can\'t set first argument as delta"; // const-string v1, "TargetSelector doesn\'t have arguments, can\'t set first argument as delta"
android.util.Log .w ( v0,v1 );
} // .end method
public void setSelector ( java.lang.String p0 ) {
/* .locals 0 */
this.mSelector = p1;
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
return;
} // .end method
public void setTarget ( java.lang.Object p0 ) {
/* .locals 0 */
this.mTarget = p1;
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/TargetSelector;->resolve()V */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
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
