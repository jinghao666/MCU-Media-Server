/* -----------------------------------------------------------------------------
 * Rule$key_method_ext.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Mon Mar 23 16:37:55 CET 2015
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

final public class Rule$key_method_ext extends Rule
{
  private Rule$key_method_ext(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }

  public static Rule$key_method_ext parse(ParserContext context)
  {
    context.push("key-method-ext");

    boolean parsed = true;
    int s0 = context.index;
    ArrayList<Rule> e0 = new ArrayList<Rule>();
    Rule rule;

    parsed = false;
    if (!parsed)
    {
      {
        ArrayList<Rule> e1 = new ArrayList<Rule>();
        int s1 = context.index;
        parsed = true;
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            int g1 = context.index;
            parsed = false;
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$ALPHA.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$DIGIT.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Terminal$StringValue.parse(context, "_");
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (context.index > g1) c1++;
            f1 = c1 > i1;
          }
          for (int i1 = 0; f1; i1++)
          {
            int g1 = context.index;
            parsed = false;
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$ALPHA.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$DIGIT.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Terminal$StringValue.parse(context, "_");
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (context.index > g1) c1++;
            f1 = c1 > i1;
          }
          parsed = c1 >= 1;
        }
        if (parsed)
          e0.addAll(e1);
        else
          context.index = s1;
      }
    }

    rule = null;
    if (parsed)
      rule = new Rule$key_method_ext(context.text.substring(s0, context.index), e0);
    else
      context.index = s0;

    context.pop("key-method-ext", parsed);

    return (Rule$key_method_ext)rule;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
