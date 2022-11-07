public class com.naef.jnlua.DefaultConverter implements com.naef.jnlua.Converter {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/naef/jnlua/DefaultConverter$18;, */
	 /* Lcom/naef/jnlua/DefaultConverter$JavaObjectConverter;, */
	 /* Lcom/naef/jnlua/DefaultConverter$LuaValueConverter; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.util.Map BOOLEAN_DISTANCE_MAP;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.Map FUNCTION_DISTANCE_MAP;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final com.naef.jnlua.DefaultConverter INSTANCE;
private static final java.util.Map JAVA_OBJECT_CONVERTERS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Lcom/naef/jnlua/DefaultConverter$JavaObjectConverter", */
/* "<*>;>;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.Map LUA_VALUE_CONVERTERS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Lcom/naef/jnlua/DefaultConverter$LuaValueConverter", */
/* "<*>;>;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.Map NUMBER_DISTANCE_MAP;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.Map STRING_DISTANCE_MAP;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.naef.jnlua.DefaultConverter ( ) {
/* .locals 6 */
int v5 = 2; // const/4 v5, 0x2
int v4 = 3; // const/4 v4, 0x3
int v3 = 1; // const/4 v3, 0x1
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = com.naef.jnlua.DefaultConverter.BOOLEAN_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Boolean; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.BOOLEAN_DISTANCE_MAP;
v1 = java.lang.Boolean.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.BOOLEAN_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Object; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Byte; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Byte.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Short; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Short.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Integer; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Integer.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Long; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Long.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Float; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Float.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Double; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Double.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/math/BigInteger; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/math/BigDecimal; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Character; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
v1 = java.lang.Character.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Object; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* const-class v1, Ljava/lang/String; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/String; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Object; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Byte; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Byte.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Short; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Short.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Integer; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Integer.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Long; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Long.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Float; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Float.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Double; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Double.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/math/BigInteger; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/math/BigDecimal; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Character; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
v1 = java.lang.Character.TYPE;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
v0 = com.naef.jnlua.DefaultConverter.FUNCTION_DISTANCE_MAP;
/* const-class v1, Lcom/naef/jnlua/JavaFunction; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
v0 = com.naef.jnlua.DefaultConverter.FUNCTION_DISTANCE_MAP;
/* const-class v1, Ljava/lang/Object; */
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$1; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$1;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Boolean; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Boolean.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$2; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$2;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Byte; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Byte.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$3; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$3;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Short; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Short.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$4; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$4;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Integer; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Integer.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$5; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$5;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Long; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Long.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$6; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$6;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Float; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Float.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$7; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$7;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Double; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Double.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$8; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$8;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/math/BigInteger; */
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$9; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$9;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/math/BigDecimal; */
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$10; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$10;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/Character; */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
v2 = java.lang.Character.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$11; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$11;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* const-class v2, Ljava/lang/String; */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$12; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$12;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Boolean; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Boolean.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$13; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$13;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Byte; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Byte.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Short; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Short.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Integer; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Integer.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Long; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Long.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Float; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Float.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Double; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Double.TYPE;
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/math/BigInteger; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/math/BigDecimal; */
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$14; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$14;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/Character; */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
v2 = java.lang.Character.TYPE;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$15; */
/* invoke-direct {v0}, Lcom/naef/jnlua/DefaultConverter$15;-><init>()V */
v1 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
/* const-class v2, Ljava/lang/String; */
return;
} // .end method
private com.naef.jnlua.DefaultConverter ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static com.naef.jnlua.DefaultConverter getInstance ( ) {
/* .locals 1 */
v0 = com.naef.jnlua.DefaultConverter.INSTANCE;
} // .end method
/* # virtual methods */
public void convertJavaObject ( com.naef.jnlua.LuaState p0, java.lang.Object p1 ) {
/* .locals 2 */
/* if-nez p2, :cond_0 */
(( com.naef.jnlua.LuaState ) p1 ).pushNil ( ); // invoke-virtual {p1}, Lcom/naef/jnlua/LuaState;->pushNil()V
} // :goto_0
return;
} // :cond_0
v0 = com.naef.jnlua.DefaultConverter.JAVA_OBJECT_CONVERTERS;
(( java.lang.Object ) p2 ).getClass ( ); // invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* check-cast v0, Lcom/naef/jnlua/DefaultConverter$JavaObjectConverter; */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
/* instance-of v0, p2, Lcom/naef/jnlua/JavaFunction; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast p2, Lcom/naef/jnlua/JavaFunction; */
(( com.naef.jnlua.LuaState ) p1 ).pushJavaFunction ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->pushJavaFunction(Lcom/naef/jnlua/JavaFunction;)V
} // :cond_2
/* instance-of v0, p2, Lcom/naef/jnlua/LuaValueProxy; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast p2, Lcom/naef/jnlua/LuaValueProxy; */
v0 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_3 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Lua value proxy is from a different Lua state"; // const-string v1, "Lua value proxy is from a different Lua state"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
} // :cond_4
(( com.naef.jnlua.LuaState ) p1 ).pushJavaObjectRaw ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->pushJavaObjectRaw(Ljava/lang/Object;)V
} // .end method
public java.lang.Object convertLuaValue ( com.naef.jnlua.LuaState p0, Integer p1, java.lang.Class p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lcom/naef/jnlua/LuaState;", */
/* "I", */
/* "Ljava/lang/Class", */
/* "<TT;>;)TT;" */
/* } */
} // .end annotation
int v3 = 2; // const/4 v3, 0x2
int v2 = 0; // const/4 v2, 0x0
int v5 = 1; // const/4 v5, 0x1
(( com.naef.jnlua.LuaState ) p1 ).type ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "undefined index: "; // const-string v2, "undefined index: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
v1 = java.lang.Void.TYPE;
/* if-ne p3, v1, :cond_1 */
/* new-instance v0, Ljava/lang/ClassCastException; */
final String v1 = "cannot convert %s to %s"; // const-string v1, "cannot convert %s to %s"
/* new-array v3, v3, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v4, v3, v2 */
(( java.lang.Class ) p3 ).getCanonicalName ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v2, v3, v5 */
java.lang.String .format ( v1,v3 );
/* invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* const-class v1, Lcom/naef/jnlua/LuaValueProxy; */
/* if-ne p3, v1, :cond_3 */
(( com.naef.jnlua.LuaState ) p1 ).getProxy ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->getProxy(I)Lcom/naef/jnlua/LuaValueProxy;
} // :cond_2
} // :goto_0
} // :cond_3
v1 = com.naef.jnlua.DefaultConverter$18.$SwitchMap$com$naef$jnlua$LuaType;
v0 = (( com.naef.jnlua.LuaType ) v0 ).ordinal ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaType;->ordinal()I
/* aget v0, v1, v0 */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_4
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_e */
(( com.naef.jnlua.LuaState ) p1 ).getProxy ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->getProxy(I)Lcom/naef/jnlua/LuaValueProxy;
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_1 */
v0 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* check-cast v0, Lcom/naef/jnlua/DefaultConverter$LuaValueConverter; */
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_5
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_4 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).toBoolean ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toBoolean(I)Z
java.lang.Boolean .valueOf ( v0 );
/* :pswitch_2 */
v0 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* check-cast v0, Lcom/naef/jnlua/DefaultConverter$LuaValueConverter; */
if ( v0 != null) { // if-eqz v0, :cond_6
} // :cond_6
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_4 */
(( com.naef.jnlua.LuaState ) p1 ).toNumber ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toNumber(I)D
/* move-result-wide v0 */
java.lang.Double .valueOf ( v0,v1 );
/* :pswitch_3 */
v0 = com.naef.jnlua.DefaultConverter.LUA_VALUE_CONVERTERS;
/* check-cast v0, Lcom/naef/jnlua/DefaultConverter$LuaValueConverter; */
if ( v0 != null) { // if-eqz v0, :cond_7
} // :cond_7
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_4 */
(( com.naef.jnlua.LuaState ) p1 ).toString ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toString(I)Ljava/lang/String;
/* :pswitch_4 */
/* const-class v0, Ljava/util/Map; */
/* if-eq p3, v0, :cond_8 */
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_9 */
} // :cond_8
(( com.naef.jnlua.LuaState ) p1 ).getProxy ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->getProxy(I)Lcom/naef/jnlua/LuaValueProxy;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$16; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultConverter$16;-><init>(Lcom/naef/jnlua/DefaultConverter;Lcom/naef/jnlua/LuaValueProxy;)V */
} // :cond_9
/* const-class v0, Ljava/util/List; */
/* if-ne p3, v0, :cond_a */
(( com.naef.jnlua.LuaState ) p1 ).getProxy ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->getProxy(I)Lcom/naef/jnlua/LuaValueProxy;
/* new-instance v0, Lcom/naef/jnlua/DefaultConverter$17; */
/* invoke-direct {v0, p0, v1}, Lcom/naef/jnlua/DefaultConverter$17;-><init>(Lcom/naef/jnlua/DefaultConverter;Lcom/naef/jnlua/LuaValueProxy;)V */
/* goto/16 :goto_0 */
} // :cond_a
v0 = (( java.lang.Class ) p3 ).isArray ( ); // invoke-virtual {p3}, Ljava/lang/Class;->isArray()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v3 = (( com.naef.jnlua.LuaState ) p1 ).length ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->length(I)I
(( java.lang.Class ) p3 ).getComponentType ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
(( java.lang.Class ) p3 ).getComponentType ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
java.lang.reflect.Array .newInstance ( v0,v3 );
/* move v1, v2 */
} // :goto_1
/* if-ge v1, v3, :cond_2 */
/* add-int/lit8 v2, v1, 0x1 */
(( com.naef.jnlua.LuaState ) p1 ).rawGet ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Lcom/naef/jnlua/LuaState;->rawGet(II)V
int v2 = -1; // const/4 v2, -0x1
try { // :try_start_0
(( com.naef.jnlua.DefaultConverter ) p0 ).convertLuaValue ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lcom/naef/jnlua/DefaultConverter;->convertLuaValue(Lcom/naef/jnlua/LuaState;ILjava/lang/Class;)Ljava/lang/Object;
java.lang.reflect.Array .set ( v0,v1,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
(( com.naef.jnlua.LuaState ) p1 ).pop ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* add-int/lit8 v1, v1, 0x1 */
/* :catchall_0 */
/* move-exception v0 */
(( com.naef.jnlua.LuaState ) p1 ).pop ( v5 ); // invoke-virtual {p1, v5}, Lcom/naef/jnlua/LuaState;->pop(I)V
/* throw v0 */
/* :pswitch_5 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaFunction ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->isJavaFunction(I)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* const-class v0, Lcom/naef/jnlua/JavaFunction; */
/* if-eq p3, v0, :cond_b */
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_4 */
} // :cond_b
(( com.naef.jnlua.LuaState ) p1 ).toJavaFunction ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toJavaFunction(I)Lcom/naef/jnlua/JavaFunction;
/* goto/16 :goto_0 */
/* :pswitch_6 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_4
/* instance-of v0, v1, Lcom/naef/jnlua/TypedJavaObject; */
if ( v0 != null) { // if-eqz v0, :cond_d
/* move-object v0, v1 */
v2 = /* check-cast v0, Lcom/naef/jnlua/TypedJavaObject; */
if ( v2 != null) { // if-eqz v2, :cond_c
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v2 = (( java.lang.Class ) p3 ).isAssignableFrom ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v2, :cond_2 */
} // :cond_c
/* check-cast v1, Lcom/naef/jnlua/TypedJavaObject; */
/* goto/16 :goto_0 */
} // :cond_d
/* move-object v0, v1 */
/* goto/16 :goto_0 */
} // :cond_e
/* new-instance v0, Ljava/lang/ClassCastException; */
final String v1 = "cannot convert %s to %s"; // const-string v1, "cannot convert %s to %s"
/* new-array v3, v3, [Ljava/lang/Object; */
(( com.naef.jnlua.LuaState ) p1 ).typeName ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->typeName(I)Ljava/lang/String;
/* aput-object v4, v3, v2 */
(( java.lang.Class ) p3 ).getCanonicalName ( ); // invoke-virtual {p3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
/* aput-object v2, v3, v5 */
java.lang.String .format ( v1,v3 );
/* invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
} // .end packed-switch
} // .end method
public Integer getTypeDistance ( com.naef.jnlua.LuaState p0, Integer p1, java.lang.Class p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/naef/jnlua/LuaState;", */
/* "I", */
/* "Ljava/lang/Class", */
/* "<*>;)I" */
/* } */
} // .end annotation
/* const v1, 0x7fffffff */
int v2 = 1; // const/4 v2, 0x1
(( com.naef.jnlua.LuaState ) p1 ).type ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->type(I)Lcom/naef/jnlua/LuaType;
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
v3 = java.lang.Void.TYPE;
/* if-ne p3, v3, :cond_1 */
/* move v0, v1 */
} // :cond_1
/* const-class v3, Lcom/naef/jnlua/LuaValueProxy; */
/* if-ne p3, v3, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
v3 = com.naef.jnlua.DefaultConverter$18.$SwitchMap$com$naef$jnlua$LuaType;
v0 = (( com.naef.jnlua.LuaType ) v0 ).ordinal ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/LuaType;->ordinal()I
/* aget v0, v3, v0 */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_3
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_8 */
/* const v0, 0x7ffffffe */
/* :pswitch_0 */
/* move v0, v2 */
/* :pswitch_1 */
v0 = com.naef.jnlua.DefaultConverter.BOOLEAN_DISTANCE_MAP;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :pswitch_2 */
v0 = com.naef.jnlua.DefaultConverter.NUMBER_DISTANCE_MAP;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :pswitch_3 */
v0 = com.naef.jnlua.DefaultConverter.STRING_DISTANCE_MAP;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :pswitch_4 */
/* const-class v0, Ljava/util/Map; */
/* if-eq p3, v0, :cond_4 */
/* const-class v0, Ljava/util/List; */
/* if-eq p3, v0, :cond_4 */
v0 = (( java.lang.Class ) p3 ).isArray ( ); // invoke-virtual {p3}, Ljava/lang/Class;->isArray()Z
if ( v0 != null) { // if-eqz v0, :cond_5
} // :cond_4
/* move v0, v2 */
} // :cond_5
/* const-class v0, Ljava/lang/Object; */
/* if-ne p3, v0, :cond_3 */
int v0 = 2; // const/4 v0, 0x2
/* :pswitch_5 */
v0 = (( com.naef.jnlua.LuaState ) p1 ).isJavaFunction ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->isJavaFunction(I)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.naef.jnlua.DefaultConverter.FUNCTION_DISTANCE_MAP;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :pswitch_6 */
(( com.naef.jnlua.LuaState ) p1 ).toJavaObjectRaw ( p2 ); // invoke-virtual {p1, p2}, Lcom/naef/jnlua/LuaState;->toJavaObjectRaw(I)Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_3
/* instance-of v3, v0, Lcom/naef/jnlua/TypedJavaObject; */
if ( v3 != null) { // if-eqz v3, :cond_7
v3 = /* check-cast v0, Lcom/naef/jnlua/TypedJavaObject; */
if ( v3 != null) { // if-eqz v3, :cond_6
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v3 = (( java.lang.Class ) p3 ).isAssignableFrom ( v3 ); // invoke-virtual {p3, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* move v0, v2 */
/* goto/16 :goto_0 */
} // :cond_6
} // :goto_1
v0 = (( java.lang.Class ) p3 ).isAssignableFrom ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v2 */
/* goto/16 :goto_0 */
} // :cond_7
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
} // :cond_8
/* move v0, v1 */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
} // .end packed-switch
} // .end method
