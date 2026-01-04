# Aero Dynamics - Branded Weather Widget

## Project Overview
This is a JavaFX desktop weather widget prototype designed for **Aero Dynamics**, an aviation technology company.  
The widget provides **critical weather information** tailored for pilots and flight planners.

---

## Company Choice
**Company:** Aero Dynamics  
**Reason for Choice:** Focuses on precision, reliability, and flight safety. The widget emphasizes minimal distraction and presents critical flight data clearly.

---

## Design Rationale

### 1. Color Palette
| Role | Color | Reason |
|------|-------|--------|
| Primary | Navy Blue (#0B1C2D) | Aviation dashboards, trust, precision |
| Secondary | Runway Gray (#3A3F45) | Aircraft panels, technical feel |
| Accent | Safety Orange (#FF8C00) | Alerts, visibility, safety |

### 2. Typography
- **Heading Font:** Arial Black (Sans-serif) — Highly legible, instrument panel style  
- **Body Font:** Arial (Sans-serif) — Clean and professional

### 3. Layout
- Top: City Name  
- Center: Temperature, Weather Condition, Compass Icon, Wind, Visibility, Flight Conditions  
- Bottom: 3-Day Forecast  

The layout prioritizes **critical flight information** for aviation professionals.

---

## Features
- Displays **current temperature and weather condition**  
- Includes **wind speed and direction**  
- Shows **flight conditions indicator (Good/Marginal/Poor)**  
- Visibility metric included  
- **Compass icon** with subtle rotation animation  
- 3-day forecast at the bottom  
- Refresh button disabled if city TextField is empty  

---

## CSS Architecture
All styling is in **external style.css**:
- Allows **easy brand customization** without touching Java code  
- Ensures **consistent look** across components

---

## Integration Challenges
- Balancing **technical data display** with a **clean UI**  
- Adding animation (compass rotation) without distracting from critical info

---

## Screenshot
![Weather Widget Screenshot](screenshot.png)

---

## Future Enhancements
- Connect to a **real weather API** for live data  
- Add **flight alerts or warnings** based on weather conditions  
- Make the **widget resizable** while keeping layout intact
