“In general, the details of object construction, such as instantiating and initialising the components that comprise the object, are kept within the object, often as part of its constructor.” Comment on this statement with reference to modularity and construction bloat.

Keeping the initialisation of object components within its constructor increases modularity and helps to avoid construction bloat. Highly coupled object contstruction makes maintanance more risky and expensive, as it decreases readability and degrades integrity of the software.
